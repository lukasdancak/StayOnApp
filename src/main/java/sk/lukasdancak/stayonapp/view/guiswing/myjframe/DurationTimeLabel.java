package sk.lukasdancak.stayonapp.view.guiswing.myjframe;

public class DurationTimeLabel extends UniClockLabel {


    public DurationTimeLabel() {
        super("Duration:");
        createLabelTextSumPart1();
        createLabelTextSumAll();
        setText(labelTextSumAll);

        //this.setSize(200,100);
        this.setBounds(50,50,200,100);

    }

    
}
