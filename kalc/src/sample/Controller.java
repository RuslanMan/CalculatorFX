package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    public Text output;
    public double num = 0;

    public boolean chek = true;

    public  String operator = "";
    public Model model = new Model();
    @FXML
    public void numbers(ActionEvent event){
        if(chek){
            output.setText("");
            chek = false;
        }
        String value = ((Button)event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    public void actions(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if (!"=".equals(value) && !"c".equals(value)){
            if (!operator.isEmpty()) return;
            operator = value;
            num = Double.parseDouble(output.getText());
            output.setText("");
        }
        else if ("c".equals(value)){
            output.setText("");
            operator = "";
            num = 0;
            chek = true;
        }
        else{
            if(operator.isEmpty()) return;
            output.setText(String.valueOf(model.calculation(num,Double.parseDouble(output.getText()),operator)));
            operator = "";
            chek = true;
        }
    }
}
