import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class HandleClickHide implements EventHandler<MouseEvent> {

    private Label lblrow1, lblrow2, lblrow3, lblcolumn1, lblcolumn2, lblcolumn3;

    public void handle (MouseEvent event){

        lblrow1.setText("");
        lblrow2.setText("");
        lblrow3.setText("");
        lblcolumn1.setText("");
        lblcolumn2.setText("");
        lblcolumn3.setText("");
    }
    public void setRow1(Label lblrow1){
        this.lblrow1 = lblrow1;
    }
    public void setRow2(Label lblrow2){
        this.lblrow2 = lblrow2;
    }
    public void setRow3(Label lblrow3){
        this.lblrow3 = lblrow3;
    }
    public void setColumn1(Label lblcolumn1){
        this.lblcolumn1 = lblcolumn1;
    }
    public void setColumn2(Label lblcolumn2){
        this.lblcolumn2 = lblcolumn2;
    }
    public void setColumn3(Label lblcolumn3){
        this.lblcolumn3 = lblcolumn3;
    }
}