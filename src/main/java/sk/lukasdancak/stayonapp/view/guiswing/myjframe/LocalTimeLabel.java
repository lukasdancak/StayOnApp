package sk.lukasdancak.stayonapp.view.guiswing.myjframe;

public class LocalTimeLabel extends UniClockLabel {


    public LocalTimeLabel() {
        super("Local Time:");
        createLabelTextSumPart1();
        createLabelTextSumAll();
        setText(labelTextSumAll);

        //this.setSize(200,100);
        this.setBounds(260,50,200,100);

    }


}
