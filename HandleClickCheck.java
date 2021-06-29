import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class HandleClickCheck implements EventHandler<MouseEvent> {

    private TextField txtSquare1, txtSquare2, txtSquare3, txtSquare4, txtSquare5, txtSquare6, txtSquare7, txtSquare8, txtSquare9;
    private Label lblResult;
    private int row1, row2, row3;
    private int column1, column2, column3;

    public void handle (MouseEvent event){

        if(isInt(txtSquare1.getText()) || isInt(txtSquare2.getText()) || isInt(txtSquare3.getText()) ||
        isInt(txtSquare4.getText()) || isInt(txtSquare5.getText()) || isInt(txtSquare6.getText()) ||
        isInt(txtSquare7.getText()) || isInt(txtSquare8.getText()) || isInt(txtSquare9.getText())){
            lblResult.setStyle("-fx-text-fill: red");
            lblResult.setText("Please fill every text box with a digit different to 0");
        }

        else if(Integer.parseInt(txtSquare1.getText()) == 0 || Integer.parseInt(txtSquare2.getText()) == 0 ||
        Integer.parseInt(txtSquare3.getText()) == 0 || Integer.parseInt(txtSquare4.getText()) == 0 ||
        Integer.parseInt(txtSquare5.getText()) == 0 || Integer.parseInt(txtSquare6.getText()) == 0 ||
        Integer.parseInt(txtSquare7.getText()) == 0 || Integer.parseInt(txtSquare8.getText()) == 0 ||
        Integer.parseInt(txtSquare9.getText()) == 0){
            lblResult.setStyle("-fx-text-fill: red");
            lblResult.setText("You cannot use 0 to create a magic square");
        }

        else if(Integer.parseInt(txtSquare1.getText()) > 9 || Integer.parseInt(txtSquare2.getText()) > 9 ||
        Integer.parseInt(txtSquare3.getText()) > 9 || Integer.parseInt(txtSquare4.getText()) > 9 ||
        Integer.parseInt(txtSquare5.getText()) > 9 || Integer.parseInt(txtSquare6.getText()) > 9 ||
        Integer.parseInt(txtSquare7.getText()) > 9 || Integer.parseInt(txtSquare8.getText()) > 9 ||
        Integer.parseInt(txtSquare9.getText()) > 9 ||
        Integer.parseInt(txtSquare1.getText()) < 0 || Integer.parseInt(txtSquare2.getText()) < 0 ||
        Integer.parseInt(txtSquare3.getText()) < 0 || Integer.parseInt(txtSquare4.getText()) < 0 ||
        Integer.parseInt(txtSquare5.getText()) < 0 || Integer.parseInt(txtSquare6.getText()) < 0 ||
        Integer.parseInt(txtSquare7.getText()) < 0 || Integer.parseInt(txtSquare8.getText()) < 0 ||
        Integer.parseInt(txtSquare9.getText()) < 0){
            lblResult.setStyle("-fx-text-fill: red");
            lblResult.setText("You have to use digits to create a magic square");
        }
        
        else if(Integer.parseInt(txtSquare1.getText()) == Integer.parseInt(txtSquare2.getText()) ||
        Integer.parseInt(txtSquare1.getText()) == Integer.parseInt(txtSquare3.getText()) ||
        Integer.parseInt(txtSquare1.getText()) == Integer.parseInt(txtSquare4.getText()) ||
        Integer.parseInt(txtSquare1.getText()) == Integer.parseInt(txtSquare5.getText()) ||
        Integer.parseInt(txtSquare1.getText()) == Integer.parseInt(txtSquare6.getText()) ||
        Integer.parseInt(txtSquare1.getText()) == Integer.parseInt(txtSquare7.getText()) ||
        Integer.parseInt(txtSquare1.getText()) == Integer.parseInt(txtSquare8.getText()) ||
        Integer.parseInt(txtSquare1.getText()) == Integer.parseInt(txtSquare9.getText()) ||
        Integer.parseInt(txtSquare2.getText()) == Integer.parseInt(txtSquare3.getText()) ||
        Integer.parseInt(txtSquare2.getText()) == Integer.parseInt(txtSquare4.getText()) ||
        Integer.parseInt(txtSquare2.getText()) == Integer.parseInt(txtSquare5.getText()) ||
        Integer.parseInt(txtSquare2.getText()) == Integer.parseInt(txtSquare6.getText()) ||
        Integer.parseInt(txtSquare2.getText()) == Integer.parseInt(txtSquare7.getText()) ||
        Integer.parseInt(txtSquare2.getText()) == Integer.parseInt(txtSquare8.getText()) ||
        Integer.parseInt(txtSquare2.getText()) == Integer.parseInt(txtSquare9.getText()) ||
        Integer.parseInt(txtSquare3.getText()) == Integer.parseInt(txtSquare4.getText()) ||
        Integer.parseInt(txtSquare3.getText()) == Integer.parseInt(txtSquare5.getText()) ||
        Integer.parseInt(txtSquare3.getText()) == Integer.parseInt(txtSquare6.getText()) ||
        Integer.parseInt(txtSquare3.getText()) == Integer.parseInt(txtSquare7.getText()) ||
        Integer.parseInt(txtSquare3.getText()) == Integer.parseInt(txtSquare8.getText()) ||
        Integer.parseInt(txtSquare3.getText()) == Integer.parseInt(txtSquare9.getText()) ||
        Integer.parseInt(txtSquare4.getText()) == Integer.parseInt(txtSquare5.getText()) ||
        Integer.parseInt(txtSquare4.getText()) == Integer.parseInt(txtSquare6.getText()) ||
        Integer.parseInt(txtSquare4.getText()) == Integer.parseInt(txtSquare7.getText()) ||
        Integer.parseInt(txtSquare4.getText()) == Integer.parseInt(txtSquare8.getText()) ||
        Integer.parseInt(txtSquare4.getText()) == Integer.parseInt(txtSquare9.getText()) ||
        Integer.parseInt(txtSquare5.getText()) == Integer.parseInt(txtSquare6.getText()) ||
        Integer.parseInt(txtSquare5.getText()) == Integer.parseInt(txtSquare7.getText()) ||
        Integer.parseInt(txtSquare5.getText()) == Integer.parseInt(txtSquare8.getText()) ||
        Integer.parseInt(txtSquare5.getText()) == Integer.parseInt(txtSquare9.getText()) ||
        Integer.parseInt(txtSquare6.getText()) == Integer.parseInt(txtSquare7.getText()) ||
        Integer.parseInt(txtSquare6.getText()) == Integer.parseInt(txtSquare8.getText()) ||
        Integer.parseInt(txtSquare6.getText()) == Integer.parseInt(txtSquare9.getText()) ||
        Integer.parseInt(txtSquare7.getText()) == Integer.parseInt(txtSquare8.getText()) ||
        Integer.parseInt(txtSquare7.getText()) == Integer.parseInt(txtSquare9.getText()) ||
        Integer.parseInt(txtSquare8.getText()) == Integer.parseInt(txtSquare9.getText())){
            lblResult.setStyle("-fx-text-fill: red");
            lblResult.setText("You cannot repeat digits to create a magic square");
        }

        else{
            row1 = Integer.parseInt(txtSquare1.getText()) + Integer.parseInt(txtSquare2.getText()) + Integer.parseInt(txtSquare3.getText());
            row2 = Integer.parseInt(txtSquare4.getText()) + Integer.parseInt(txtSquare5.getText()) + Integer.parseInt(txtSquare6.getText());
            row3 = Integer.parseInt(txtSquare7.getText()) + Integer.parseInt(txtSquare8.getText()) + Integer.parseInt(txtSquare9.getText());
            
            column1 = Integer.parseInt(txtSquare1.getText()) + Integer.parseInt(txtSquare4.getText()) + Integer.parseInt(txtSquare7.getText());
            column2 = Integer.parseInt(txtSquare2.getText()) + Integer.parseInt(txtSquare5.getText()) + Integer.parseInt(txtSquare8.getText());
            column3 = Integer.parseInt(txtSquare3.getText()) + Integer.parseInt(txtSquare6.getText()) + Integer.parseInt(txtSquare9.getText());

            if((row1 == row2) && (row1 == row3) && (row1 == column1) && (row1 == column2) && (row1 == column3)){
                lblResult.setText("This is a magic square!");
                lblResult.setStyle("-fx-text-fill: green");
            }
            else{
                lblResult.setStyle("-fx-text-fill: red");
                lblResult.setText("This is not a magic square");
            }
        }


    }

    public boolean isInt(String s) {
        try {
            int i = Integer.parseInt(s);
        } catch (NumberFormatException | NullPointerException nfe) {
            return true;
        }
        return false;
    }

    public void setLblResult(Label lblResult){
        this.lblResult = lblResult;
    }
    public void setTxtSquare1(TextField txtSquare1){
        this.txtSquare1 = txtSquare1;
    }
    public void setTxtSquare2(TextField txtSquare2){
        this.txtSquare2 = txtSquare2;
    }
    public void setTxtSquare3(TextField txtSquare3){
        this.txtSquare3 = txtSquare3;
    }
    public void setTxtSquare4(TextField txtSquare4){
        this.txtSquare4 = txtSquare4;
    }
    public void setTxtSquare5(TextField txtSquare5){
        this.txtSquare5 = txtSquare5;
    }
    public void setTxtSquare6(TextField txtSquare6){
        this.txtSquare6 = txtSquare6;
    }
    public void setTxtSquare7(TextField txtSquare7){
        this.txtSquare7 = txtSquare7;
    }
    public void setTxtSquare8(TextField txtSquare8){
        this.txtSquare8 = txtSquare8;
    }
    public void setTxtSquare9(TextField txtSquare9){
        this.txtSquare9 = txtSquare9;
    }
}