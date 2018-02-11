package emmastewartgui;

import javax.swing.JOptionPane;

/**
 *
 * @author Emma
 */
public class ESGuiPersonalInfo extends javax.swing.JDialog {

    public ESGuiPersonalInfo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        displayPersonalBests();
    }

    public void displayPersonalBests() {

        EmmaStewartGUI manager = new EmmaStewartGUI();

        int pbID = 1;

        //Username
        String userName = manager.selectItem("PersonalInformation", "name", "pbID", Integer.toString(1));
        txtfldName.setText(userName);

        //50FL
        //Make a variable that gets the Mins, secs, and milliseconds from the DB
        String FL50Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(2));
        String FL50Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(2));
        String FL50Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(2));

        //Now take those values and plug them into the GUI components
        spnFL50Mins.setValue(Integer.parseInt(FL50Mins));
        spnFL50Secs.setValue(Integer.parseInt(FL50Secs));
        spnFL50Milli.setValue(Integer.parseInt(FL50Milli));

        //50BK
        String BK50Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(3));
        String BK50Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(3));
        String BK50Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(3));

        spnBK50Mins.setValue(Integer.parseInt(BK50Mins));
        spnBK50Secs.setValue(Integer.parseInt(BK50Secs));
        spnBK50Milli.setValue(Integer.parseInt(BK50Milli));

        //50BR
        String BR50Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(4));
        String BR50Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(4));
        String BR50Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(4));

        spnBR50Mins.setValue(Integer.parseInt(BR50Mins));
        spnBR50Secs.setValue(Integer.parseInt(BR50Secs));
        spnBK50Milli.setValue(Integer.parseInt(BK50Milli));

        //50FR
        String FR50Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(5));
        String FR50Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(5));
        String FR50Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(5));

        spnFR50Mins.setValue(Integer.parseInt(FR50Mins));
        spnFR50Secs.setValue(Integer.parseInt(FR50Secs));
        spnFR50Milli.setValue(Integer.parseInt(FR50Milli));

        //100FL
        String FL100Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(6));
        String FL100Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(6));
        String FL100Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(6));

        spnFL100Mins.setValue(Integer.parseInt(FL100Mins));
        spnFL100Secs.setValue(Integer.parseInt(FL100Secs));
        spnFL100Milli.setValue(Integer.parseInt(FL100Milli));

        //100BK
        String BK100Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(7));
        String BK100Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(7));
        String BK100Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(7));

        spnBK100Mins.setValue(Integer.parseInt(BK100Mins));
        spnBK100Secs.setValue(Integer.parseInt(BK100Secs));
        spnBK100Milli.setValue(Integer.parseInt(BK100Milli));

        //100BR 
        String BR100Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(8));
        String BR100Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(8));
        String BR100Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(8));

        spnBR100Mins.setValue(Integer.parseInt(BR100Mins));
        spnBR100Secs.setValue(Integer.parseInt(BR100Secs));
        spnBR100Milli.setValue(Integer.parseInt(BR100Milli));

        //100FR
        String FR100Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(9));
        String FR100Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(9));
        String FR100Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(9));

        spnFR100Mins.setValue(Integer.parseInt(FR100Mins));
        spnFR100Secs.setValue(Integer.parseInt(FR100Secs));
        spnFR100Milli.setValue(Integer.parseInt(FR100Milli));

        //100IM
        String IM100Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(10));
        String IM100Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(10));
        String IM100Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(10));

        spnIM100Mins.setValue(Integer.parseInt(IM100Mins));
        spnIM100Secs.setValue(Integer.parseInt(IM100Secs));
        spnIM100Milli.setValue(Integer.parseInt(IM100Milli));

        //200FL
        String FL200Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(11));
        String FL200Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(11));
        String FL200Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(11));

        spnFL200Mins.setValue(Integer.parseInt(FL200Mins));
        spnFL200Secs.setValue(Integer.parseInt(FL200Secs));
        spnFL100Milli.setValue(Integer.parseInt(FL100Milli));

        //200BK
        String BK200Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(12));
        String BK200Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(12));
        String BK200Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(12));

        spnBK200Mins.setValue(Integer.parseInt(BK200Mins));
        spnBK200Secs.setValue(Integer.parseInt(BK200Secs));
        spnBK200Milli.setValue(Integer.parseInt(BK200Milli));

        //200BR
        String BR200Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(13));
        String BR200Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(13));
        String BR200Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(13));

        spnBR200Mins.setValue(Integer.parseInt(BR200Mins));
        spnBR200Secs.setValue(Integer.parseInt(BR200Secs));
        spnBR200Milli.setValue(Integer.parseInt(BR200Milli));

        //200FR
        String FR200Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(14));
        String FR200Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(14));
        String FR200Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(14));

        spnFR200Mins.setValue(Integer.parseInt(FR200Mins));
        spnFR200Secs.setValue(Integer.parseInt(FR200Secs));
        spnFR200Milli.setValue(Integer.parseInt(FR200Milli));

        //200IM
        String IM200Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(15));
        String IM200Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(15));
        String IM200Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(15));

        spnIM200Mins.setValue(Integer.parseInt(IM200Mins));
        spnIM200Secs.setValue(Integer.parseInt(IM200Secs));
        spnIM200Milli.setValue(Integer.parseInt(IM200Milli));

        //400FR
        String FR400Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(16));
        String FR400Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(16));
        String FR400Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(16));

        spnFR400Mins.setValue(Integer.parseInt(FR400Mins));
        spnFR400Secs.setValue(Integer.parseInt(FR400Secs));
        spnFR400Milli.setValue(Integer.parseInt(FR400Milli));

        //400IM
        String IM400Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(17));
        String IM400Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(17));
        String IM400Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(17));

        spnIM400Mins.setValue(Integer.parseInt(IM400Mins));
        spnIM400Secs.setValue(Integer.parseInt(IM400Secs));
        spnIM400Milli.setValue(Integer.parseInt(IM400Milli));

        //800FR
        String FR800Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(18));
        String FR800Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(18));
        String FR800Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(18));

        spnFR800Mins.setValue(Integer.parseInt(FR800Mins));
        spnFR800Secs.setValue(Integer.parseInt(FR800Secs));
        spnFR800Milli.setValue(Integer.parseInt(FR800Milli));

        //1000FR
        String FR1000Mins = manager.selectItem("PersonalInformation", "mins", "pbID", Integer.toString(19));
        String FR1000Secs = manager.selectItem("PersonalInformation", "secs", "pbID", Integer.toString(19));
        String FR1000Milli = manager.selectItem("PersonalInformation", "milli", "pbID", Integer.toString(19));

        spnFR1000Mins.setValue(Integer.parseInt(FR1000Mins));
        spnFR1000Secs.setValue(Integer.parseInt(FR1000Secs));
        spnFR1000Milli.setValue(Integer.parseInt(FR1000Milli));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPersonalBests = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbl200Back = new javax.swing.JPanel();
        lbl50Back = new javax.swing.JLabel();
        lbl50Fly = new javax.swing.JLabel();
        lbl50Free = new javax.swing.JLabel();
        lblNamePB4 = new javax.swing.JLabel();
        lbl200Fly = new javax.swing.JLabel();
        lbl100Back = new javax.swing.JLabel();
        lbl100Breast = new javax.swing.JLabel();
        lbl100Free = new javax.swing.JLabel();
        lbl100Fly = new javax.swing.JLabel();
        lblNamePB10 = new javax.swing.JLabel();
        lbl200Breast = new javax.swing.JLabel();
        lbl200Free = new javax.swing.JLabel();
        lbl200IM = new javax.swing.JLabel();
        lbl100IM = new javax.swing.JLabel();
        lbl400Free = new javax.swing.JLabel();
        lbl400IM = new javax.swing.JLabel();
        lbl1000Free = new javax.swing.JLabel();
        lbl800Free = new javax.swing.JLabel();
        lblColon4 = new javax.swing.JLabel();
        spnFL50Mins = new javax.swing.JSpinner();
        spnFL50Secs = new javax.swing.JSpinner();
        lblColon5 = new javax.swing.JLabel();
        spnBK50Mins = new javax.swing.JSpinner();
        spnBK50Secs = new javax.swing.JSpinner();
        lblColon6 = new javax.swing.JLabel();
        spnBR50Mins = new javax.swing.JSpinner();
        spnBR50Secs = new javax.swing.JSpinner();
        lblColon7 = new javax.swing.JLabel();
        spnFR50Mins = new javax.swing.JSpinner();
        spnFR50Secs = new javax.swing.JSpinner();
        lblColon8 = new javax.swing.JLabel();
        spnFL100Mins = new javax.swing.JSpinner();
        spnFL100Secs = new javax.swing.JSpinner();
        lblColon9 = new javax.swing.JLabel();
        spnBK100Mins = new javax.swing.JSpinner();
        spnBK100Secs = new javax.swing.JSpinner();
        lblColon10 = new javax.swing.JLabel();
        spnBR100Mins = new javax.swing.JSpinner();
        spnBR100Secs = new javax.swing.JSpinner();
        lblColon11 = new javax.swing.JLabel();
        spnFR100Mins = new javax.swing.JSpinner();
        spnFR100Secs = new javax.swing.JSpinner();
        lblColon12 = new javax.swing.JLabel();
        spnIM100Mins = new javax.swing.JSpinner();
        spnIM100Secs = new javax.swing.JSpinner();
        lblColon13 = new javax.swing.JLabel();
        spnFL200Mins = new javax.swing.JSpinner();
        spnFL200Secs = new javax.swing.JSpinner();
        lblColon14 = new javax.swing.JLabel();
        spnBK200Mins = new javax.swing.JSpinner();
        spnBK200Secs = new javax.swing.JSpinner();
        lblColon15 = new javax.swing.JLabel();
        spnBR200Mins = new javax.swing.JSpinner();
        spnBR200Secs = new javax.swing.JSpinner();
        lblColon16 = new javax.swing.JLabel();
        spnFR200Mins = new javax.swing.JSpinner();
        spnFR200Secs = new javax.swing.JSpinner();
        lblColon17 = new javax.swing.JLabel();
        spnIM200Mins = new javax.swing.JSpinner();
        spnIM200Secs = new javax.swing.JSpinner();
        lblColon18 = new javax.swing.JLabel();
        spnFR400Secs = new javax.swing.JSpinner();
        spnFR400Mins = new javax.swing.JSpinner();
        lblColon19 = new javax.swing.JLabel();
        spnIM400Secs = new javax.swing.JSpinner();
        spnIM400Mins = new javax.swing.JSpinner();
        lblColon20 = new javax.swing.JLabel();
        spnFR800Secs = new javax.swing.JSpinner();
        spnFR800Mins = new javax.swing.JSpinner();
        spnFR1000Mins = new javax.swing.JSpinner();
        spnFR1000Secs = new javax.swing.JSpinner();
        lblColon21 = new javax.swing.JLabel();
        lblColon22 = new javax.swing.JLabel();
        spnFL50Milli = new javax.swing.JSpinner();
        lblColon23 = new javax.swing.JLabel();
        lblColon24 = new javax.swing.JLabel();
        lblColon25 = new javax.swing.JLabel();
        lblColon26 = new javax.swing.JLabel();
        lblColon27 = new javax.swing.JLabel();
        lblColon28 = new javax.swing.JLabel();
        lblColon29 = new javax.swing.JLabel();
        lblColon30 = new javax.swing.JLabel();
        lblColon31 = new javax.swing.JLabel();
        lblColon32 = new javax.swing.JLabel();
        lblColon33 = new javax.swing.JLabel();
        lblColon34 = new javax.swing.JLabel();
        lblColon35 = new javax.swing.JLabel();
        lblColon36 = new javax.swing.JLabel();
        lblColon37 = new javax.swing.JLabel();
        lblColon38 = new javax.swing.JLabel();
        lblColon39 = new javax.swing.JLabel();
        spnBK50Milli = new javax.swing.JSpinner();
        spnBR50Milli = new javax.swing.JSpinner();
        spnFR50Milli = new javax.swing.JSpinner();
        spnFL100Milli = new javax.swing.JSpinner();
        spnBK100Milli = new javax.swing.JSpinner();
        spnBR100Milli = new javax.swing.JSpinner();
        spnFR100Milli = new javax.swing.JSpinner();
        spnIM100Milli = new javax.swing.JSpinner();
        spnFL200Milli = new javax.swing.JSpinner();
        spnBK200Milli = new javax.swing.JSpinner();
        spnBR200Milli = new javax.swing.JSpinner();
        spnFR200Milli = new javax.swing.JSpinner();
        spnIM200Milli = new javax.swing.JSpinner();
        spnFR400Milli = new javax.swing.JSpinner();
        spnIM400Milli = new javax.swing.JSpinner();
        spnFR800Milli = new javax.swing.JSpinner();
        spnFR1000Milli = new javax.swing.JSpinner();
        btnSavePB = new javax.swing.JButton();
        lblProfile = new javax.swing.JLabel();
        btnDonePB = new javax.swing.JButton();
        lblNamePB = new javax.swing.JLabel();
        txtfldName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPersonalBests.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblPersonalBests.setText("Personal Bests");

        lbl50Back.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl50Back.setText("50m Backstroke:");

        lbl50Fly.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl50Fly.setText("50m Butterfly:");

        lbl50Free.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl50Free.setText("50m Freestyle:");

        lblNamePB4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNamePB4.setText("50m Breaststroke:");

        lbl200Fly.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl200Fly.setText("200m Butterfly:");

        lbl100Back.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl100Back.setText("100m Backstroke:");

        lbl100Breast.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl100Breast.setText("100m Breaststroke:");

        lbl100Free.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl100Free.setText("100m Freestyle:");

        lbl100Fly.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl100Fly.setText("100m Butterfly:");

        lblNamePB10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNamePB10.setText("200m Backstroke:");

        lbl200Breast.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl200Breast.setText("200m Breaststroke:");

        lbl200Free.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl200Free.setText("200m Freestyle:");

        lbl200IM.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl200IM.setText("200m Individual Medley:");

        lbl100IM.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl100IM.setText("100m Individual Medley:");

        lbl400Free.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl400Free.setText("400m Freestyle:");

        lbl400IM.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl400IM.setText("400m Individual Medley:");

        lbl1000Free.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl1000Free.setText("1000m Freestyle:");

        lbl800Free.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl800Free.setText("800m Freestyle:");

        lblColon4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon4.setText(":");

        spnFL50Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL50Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFL50Mins.setToolTipText("00");

        spnFL50Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL50Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFL50Secs.setToolTipText("00");
        spnFL50Secs.setRequestFocusEnabled(false);

        lblColon5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon5.setText(":");

        spnBK50Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK50Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnBK50Mins.setToolTipText("00");
        spnBK50Mins.setRequestFocusEnabled(false);

        spnBK50Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK50Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBK50Secs.setToolTipText("00");
        spnBK50Secs.setRequestFocusEnabled(false);

        lblColon6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon6.setText(":");

        spnBR50Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR50Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnBR50Mins.setToolTipText("00");
        spnBR50Mins.setRequestFocusEnabled(false);

        spnBR50Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR50Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBR50Secs.setToolTipText("00");
        spnBR50Secs.setRequestFocusEnabled(false);

        lblColon7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon7.setText(":");

        spnFR50Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR50Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFR50Mins.setToolTipText("00");
        spnFR50Mins.setRequestFocusEnabled(false);

        spnFR50Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR50Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR50Secs.setToolTipText("00");
        spnFR50Secs.setRequestFocusEnabled(false);

        lblColon8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon8.setText(":");

        spnFL100Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL100Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFL100Mins.setToolTipText("00");
        spnFL100Mins.setRequestFocusEnabled(false);

        spnFL100Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL100Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFL100Secs.setToolTipText("00");
        spnFL100Secs.setRequestFocusEnabled(false);

        lblColon9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon9.setText(":");

        spnBK100Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK100Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnBK100Mins.setToolTipText("00");
        spnBK100Mins.setRequestFocusEnabled(false);

        spnBK100Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK100Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBK100Secs.setToolTipText("00");
        spnBK100Secs.setRequestFocusEnabled(false);

        lblColon10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon10.setText(":");

        spnBR100Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR100Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnBR100Mins.setToolTipText("00");
        spnBR100Mins.setRequestFocusEnabled(false);

        spnBR100Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR100Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBR100Secs.setToolTipText("00");
        spnBR100Secs.setRequestFocusEnabled(false);

        lblColon11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon11.setText(":");

        spnFR100Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR100Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFR100Mins.setToolTipText("00");
        spnFR100Mins.setRequestFocusEnabled(false);

        spnFR100Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR100Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR100Secs.setToolTipText("00");
        spnFR100Secs.setRequestFocusEnabled(false);

        lblColon12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon12.setText(":");

        spnIM100Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM100Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnIM100Mins.setToolTipText("00");
        spnIM100Mins.setRequestFocusEnabled(false);

        spnIM100Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM100Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnIM100Secs.setToolTipText("00");
        spnIM100Secs.setRequestFocusEnabled(false);

        lblColon13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon13.setText(":");

        spnFL200Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL200Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFL200Mins.setToolTipText("00");
        spnFL200Mins.setRequestFocusEnabled(false);

        spnFL200Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL200Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFL200Secs.setToolTipText("00");
        spnFL200Secs.setRequestFocusEnabled(false);

        lblColon14.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon14.setText(":");

        spnBK200Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK200Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnBK200Mins.setToolTipText("00");
        spnBK200Mins.setRequestFocusEnabled(false);

        spnBK200Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK200Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBK200Secs.setToolTipText("00");
        spnBK200Secs.setRequestFocusEnabled(false);

        lblColon15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon15.setText(":");

        spnBR200Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR200Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnBR200Mins.setToolTipText("00");
        spnBR200Mins.setRequestFocusEnabled(false);

        spnBR200Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR200Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBR200Secs.setToolTipText("00");
        spnBR200Secs.setRequestFocusEnabled(false);

        lblColon16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon16.setText(":");

        spnFR200Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR200Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFR200Mins.setToolTipText("00");
        spnFR200Mins.setRequestFocusEnabled(false);

        spnFR200Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR200Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR200Secs.setToolTipText("00");
        spnFR200Secs.setRequestFocusEnabled(false);

        lblColon17.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon17.setText(":");

        spnIM200Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM200Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnIM200Mins.setToolTipText("00");
        spnIM200Mins.setRequestFocusEnabled(false);

        spnIM200Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM200Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnIM200Secs.setToolTipText("00");
        spnIM200Secs.setRequestFocusEnabled(false);

        lblColon18.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon18.setText(":");

        spnFR400Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR400Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR400Secs.setToolTipText("00");
        spnFR400Secs.setRequestFocusEnabled(false);

        spnFR400Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR400Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFR400Mins.setToolTipText("00");
        spnFR400Mins.setRequestFocusEnabled(false);

        lblColon19.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon19.setText(":");

        spnIM400Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM400Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnIM400Secs.setToolTipText("00");
        spnIM400Secs.setRequestFocusEnabled(false);

        spnIM400Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM400Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnIM400Mins.setToolTipText("00");
        spnIM400Mins.setRequestFocusEnabled(false);

        lblColon20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon20.setText(":");

        spnFR800Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR800Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR800Secs.setToolTipText("00");
        spnFR800Secs.setRequestFocusEnabled(false);

        spnFR800Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR800Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFR800Mins.setToolTipText("00");
        spnFR800Mins.setRequestFocusEnabled(false);

        spnFR1000Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR1000Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFR1000Mins.setToolTipText("00");
        spnFR1000Mins.setRequestFocusEnabled(false);

        spnFR1000Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR1000Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR1000Secs.setToolTipText("00");
        spnFR1000Secs.setRequestFocusEnabled(false);

        lblColon21.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon21.setText(":");

        lblColon22.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon22.setText(".");

        spnFL50Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL50Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFL50Milli.setToolTipText("00");
        spnFL50Milli.setRequestFocusEnabled(false);

        lblColon23.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon23.setText(".");

        lblColon24.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon24.setText(".");

        lblColon25.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon25.setText(".");

        lblColon26.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon26.setText(".");

        lblColon27.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon27.setText(".");

        lblColon28.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon28.setText(".");

        lblColon29.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon29.setText(".");

        lblColon30.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon30.setText(".");

        lblColon31.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon31.setText(".");

        lblColon32.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon32.setText(".");

        lblColon33.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon33.setText(".");

        lblColon34.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon34.setText(".");

        lblColon35.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon35.setText(".");

        lblColon36.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon36.setText(".");

        lblColon37.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon37.setText(".");

        lblColon38.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon38.setText(".");

        lblColon39.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon39.setText(".");

        spnBK50Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK50Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBK50Milli.setToolTipText("00");
        spnBK50Milli.setRequestFocusEnabled(false);

        spnBR50Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR50Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBR50Milli.setToolTipText("00");
        spnBR50Milli.setRequestFocusEnabled(false);

        spnFR50Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR50Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR50Milli.setToolTipText("00");
        spnFR50Milli.setRequestFocusEnabled(false);

        spnFL100Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL100Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFL100Milli.setToolTipText("00");
        spnFL100Milli.setRequestFocusEnabled(false);

        spnBK100Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK100Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBK100Milli.setToolTipText("00");
        spnBK100Milli.setRequestFocusEnabled(false);

        spnBR100Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR100Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBR100Milli.setToolTipText("00");
        spnBR100Milli.setRequestFocusEnabled(false);

        spnFR100Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR100Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR100Milli.setToolTipText("00");
        spnFR100Milli.setRequestFocusEnabled(false);

        spnIM100Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM100Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnIM100Milli.setToolTipText("00");
        spnIM100Milli.setRequestFocusEnabled(false);

        spnFL200Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL200Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFL200Milli.setToolTipText("00");
        spnFL200Milli.setRequestFocusEnabled(false);

        spnBK200Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK200Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBK200Milli.setToolTipText("00");
        spnBK200Milli.setRequestFocusEnabled(false);

        spnBR200Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR200Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBR200Milli.setToolTipText("00");
        spnBR200Milli.setRequestFocusEnabled(false);

        spnFR200Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR200Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR200Milli.setToolTipText("00");
        spnFR200Milli.setRequestFocusEnabled(false);

        spnIM200Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM200Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnIM200Milli.setToolTipText("00");
        spnIM200Milli.setRequestFocusEnabled(false);

        spnFR400Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR400Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR400Milli.setToolTipText("00");
        spnFR400Milli.setRequestFocusEnabled(false);

        spnIM400Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM400Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnIM400Milli.setToolTipText("00");
        spnIM400Milli.setRequestFocusEnabled(false);

        spnFR800Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR800Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR800Milli.setToolTipText("00");
        spnFR800Milli.setRequestFocusEnabled(false);

        spnFR1000Milli.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR1000Milli.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR1000Milli.setToolTipText("00");
        spnFR1000Milli.setRequestFocusEnabled(false);

        javax.swing.GroupLayout lbl200BackLayout = new javax.swing.GroupLayout(lbl200Back);
        lbl200Back.setLayout(lbl200BackLayout);
        lbl200BackLayout.setHorizontalGroup(
            lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl200BackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                            .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl50Free)
                                .addComponent(lblNamePB4)
                                .addComponent(lbl50Back)
                                .addComponent(lbl50Fly)
                                .addComponent(lbl200Fly)
                                .addComponent(lblNamePB10))
                            .addGap(117, 117, 117)
                            .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(lbl200BackLayout.createSequentialGroup()
                                    .addComponent(spnBK200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblColon14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnBK200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lbl200BackLayout.createSequentialGroup()
                                    .addComponent(spnFL200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblColon13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnFL200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(lbl200BackLayout.createSequentialGroup()
                                            .addComponent(spnFL50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblColon4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnFL50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(lbl200BackLayout.createSequentialGroup()
                                            .addComponent(spnBK50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblColon5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnBK50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                                            .addComponent(spnBR50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblColon6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnBR50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(lbl200BackLayout.createSequentialGroup()
                                        .addComponent(spnFR50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblColon7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnFR50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(lbl200BackLayout.createSequentialGroup()
                            .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl200Breast)
                                .addComponent(lbl200Free))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(lbl200BackLayout.createSequentialGroup()
                                    .addComponent(spnFR200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblColon16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnFR200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lbl200BackLayout.createSequentialGroup()
                                    .addComponent(spnBR200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblColon15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnBR200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(lbl200BackLayout.createSequentialGroup()
                        .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl200IM)
                            .addComponent(lbl400Free))
                        .addGap(18, 18, 18)
                        .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnFR400Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnFR400Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnIM200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnIM200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                            .addComponent(lbl400IM)
                            .addGap(18, 18, 18)
                            .addComponent(spnIM400Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblColon19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spnIM400Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(lbl200BackLayout.createSequentialGroup()
                            .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl800Free)
                                .addComponent(lbl1000Free))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(lbl200BackLayout.createSequentialGroup()
                                    .addComponent(spnFR1000Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblColon21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnFR1000Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lbl200BackLayout.createSequentialGroup()
                                    .addComponent(spnFR800Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblColon20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnFR800Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(lbl200BackLayout.createSequentialGroup()
                        .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl100IM)
                            .addComponent(lbl100Free)
                            .addComponent(lbl100Breast)
                            .addComponent(lbl100Back)
                            .addComponent(lbl100Fly))
                        .addGap(18, 18, 18)
                        .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnFL100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnFL100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnBK100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnBK100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnBR100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnBR100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnFR100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnFR100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnIM100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnIM100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(1, 1, 1)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblColon22)
                    .addComponent(lblColon23)
                    .addComponent(lblColon24)
                    .addComponent(lblColon25)
                    .addComponent(lblColon31)
                    .addComponent(lblColon32)
                    .addComponent(lblColon33)
                    .addComponent(lblColon34)
                    .addComponent(lblColon36)
                    .addComponent(lblColon35)
                    .addComponent(lblColon37)
                    .addComponent(lblColon38)
                    .addComponent(lblColon39)
                    .addComponent(lblColon26)
                    .addComponent(lblColon27)
                    .addComponent(lblColon28)
                    .addComponent(lblColon29)
                    .addComponent(lblColon30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnFL50Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBK50Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBR50Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR50Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFL200Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBK200Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBR200Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR200Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR400Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnIM200Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnIM400Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR800Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR1000Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFL100Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBK100Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBR100Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR100Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnIM100Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(588, Short.MAX_VALUE))
        );
        lbl200BackLayout.setVerticalGroup(
            lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl200BackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl50Fly, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon4)
                    .addComponent(spnFL50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFL50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon22)
                    .addComponent(spnFL50Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl50Back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon5)
                    .addComponent(spnBK50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBK50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon23)
                    .addComponent(spnBK50Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamePB4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon6)
                    .addComponent(spnBR50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBR50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon24)
                    .addComponent(spnBR50Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl50Free, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon7)
                    .addComponent(spnFR50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon25)
                    .addComponent(spnFR50Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl100Fly, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon8)
                    .addComponent(spnFL100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFL100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon26)
                    .addComponent(spnFL100Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl100Back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon9)
                    .addComponent(spnBK100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBK100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon27)
                    .addComponent(spnBK100Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl100Breast, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon10)
                    .addComponent(spnBR100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBR100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon28)
                    .addComponent(spnBR100Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl100Free, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon11)
                    .addComponent(spnFR100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon29)
                    .addComponent(spnFR100Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl100IM, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon12)
                    .addComponent(spnIM100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnIM100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon30)
                    .addComponent(spnIM100Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl200Fly, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon13)
                    .addComponent(spnFL200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFL200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon31)
                    .addComponent(spnFL200Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamePB10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon14)
                    .addComponent(spnBK200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBK200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon32)
                    .addComponent(spnBK200Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl200Breast, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon15)
                    .addComponent(spnBR200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBR200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon33)
                    .addComponent(spnBR200Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl200Free, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon16)
                    .addComponent(spnFR200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon34)
                    .addComponent(spnFR200Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl200IM, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon17)
                    .addComponent(spnIM200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnIM200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon35)
                    .addComponent(spnIM200Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl400Free, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon18)
                    .addComponent(spnFR400Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR400Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon36)
                    .addComponent(spnFR400Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl400IM, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon19)
                    .addComponent(spnIM400Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnIM400Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon37)
                    .addComponent(spnIM400Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl800Free)
                    .addComponent(lblColon20)
                    .addComponent(spnFR800Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR800Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon38)
                    .addComponent(spnFR800Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColon21)
                    .addComponent(spnFR1000Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR1000Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1000Free, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon39)
                    .addComponent(spnFR1000Milli, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        spnFL50Mins.getAccessibleContext().setAccessibleName("");

        jScrollPane1.setViewportView(lbl200Back);

        btnSavePB.setText("SAVE");
        btnSavePB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePBActionPerformed(evt);
            }
        });

        lblProfile.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        lblProfile.setText("Profile");

        btnDonePB.setText("DONE");
        btnDonePB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonePBActionPerformed(evt);
            }
        });

        lblNamePB.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNamePB.setText("Name:");

        txtfldName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldName.setText("[insert name]");
        txtfldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1080, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSavePB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDonePB, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPersonalBests, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(lblNamePB)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtfldName, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblProfile))
                    .addContainerGap(231, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSavePB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDonePB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNamePB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfldName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addComponent(lblPersonalBests, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(481, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSavePBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePBActionPerformed
        EmmaStewartGUI manager = new EmmaStewartGUI();

        manager.updatePBName(txtfldName.getText(), 1);

        //FL50
        Integer mins = Integer.parseInt(spnFL50Mins.getValue().toString());
        Integer secs = Integer.parseInt(spnFL50Secs.getValue().toString());
        Integer milli = Integer.parseInt(spnFL50Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 2);

        //50BK
        mins = Integer.parseInt(spnBK50Mins.getValue().toString());
        secs = Integer.parseInt(spnBK50Secs.getValue().toString());
        milli = Integer.parseInt(spnBK50Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 3);

        //50BR
        mins = Integer.parseInt(spnBR50Mins.getValue().toString());
        secs = Integer.parseInt(spnBR50Secs.getValue().toString());
        milli = Integer.parseInt(spnBR50Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 4);

        //50FR
        mins = Integer.parseInt(spnFR50Mins.getValue().toString());
        secs = Integer.parseInt(spnFR50Secs.getValue().toString());
        milli = Integer.parseInt(spnFR50Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 5);

        //100FL
        mins = Integer.parseInt(spnFL100Mins.getValue().toString());
        secs = Integer.parseInt(spnFL100Secs.getValue().toString());
        milli = Integer.parseInt(spnFL100Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 6);

        //100BK
        mins = Integer.parseInt(spnBK100Mins.getValue().toString());
        secs = Integer.parseInt(spnBK100Secs.getValue().toString());
        milli = Integer.parseInt(spnBK100Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 7);
        //100BR 
        mins = Integer.parseInt(spnBR100Mins.getValue().toString());
        secs = Integer.parseInt(spnBR100Secs.getValue().toString());
        milli = Integer.parseInt(spnBR100Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 8);

        //100FR
        mins = Integer.parseInt(spnFR100Mins.getValue().toString());
        secs = Integer.parseInt(spnFR100Secs.getValue().toString());
        milli = Integer.parseInt(spnFR100Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 9);
        //100IM
        mins = Integer.parseInt(spnIM100Mins.getValue().toString());
        secs = Integer.parseInt(spnIM100Secs.getValue().toString());
        milli = Integer.parseInt(spnIM100Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 10);

        //200FL
        mins = Integer.parseInt(spnFL200Mins.getValue().toString());
        secs = Integer.parseInt(spnFL200Secs.getValue().toString());
        milli = Integer.parseInt(spnFL200Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 11);

        //200BK
        mins = Integer.parseInt(spnBK200Mins.getValue().toString());
        secs = Integer.parseInt(spnBK200Secs.getValue().toString());
        milli = Integer.parseInt(spnBK200Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 12);

        //200BR
        mins = Integer.parseInt(spnBR200Mins.getValue().toString());
        secs = Integer.parseInt(spnBR200Secs.getValue().toString());
        milli = Integer.parseInt(spnBR200Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 13);

        //200FR
        mins = Integer.parseInt(spnFR200Mins.getValue().toString());
        secs = Integer.parseInt(spnFR200Secs.getValue().toString());
        milli = Integer.parseInt(spnFR200Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 14);
        
        //200IM
        mins = Integer.parseInt(spnIM200Mins.getValue().toString());
        secs = Integer.parseInt(spnIM200Secs.getValue().toString());
        milli = Integer.parseInt(spnIM200Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 15);


        //400FR
        mins = Integer.parseInt(spnFR400Mins.getValue().toString());
        secs = Integer.parseInt(spnFR400Secs.getValue().toString());
        milli = Integer.parseInt(spnFR400Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 16);

        //400IM
        mins = Integer.parseInt(spnIM400Mins.getValue().toString());
        secs = Integer.parseInt(spnIM400Secs.getValue().toString());
        milli = Integer.parseInt(spnIM400Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 17);

        //800FR
        mins = Integer.parseInt(spnFR800Mins.getValue().toString());
        secs = Integer.parseInt(spnFR800Secs.getValue().toString());
        milli = Integer.parseInt(spnFR800Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 18);

        //1000FR
        mins = Integer.parseInt(spnFR1000Mins.getValue().toString());
        secs = Integer.parseInt(spnFR1000Secs.getValue().toString());
        milli = Integer.parseInt(spnFR1000Milli.getValue().toString());
        manager.updatePB(mins, secs, milli, 19);
        
        JOptionPane.showMessageDialog(null, "Personal bests updated");
    }//GEN-LAST:event_btnSavePBActionPerformed

    private void txtfldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldNameActionPerformed

    private void btnDonePBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonePBActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDonePBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ESGuiPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ESGuiPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ESGuiPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ESGuiPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ESGuiPersonalInfo dialog = new ESGuiPersonalInfo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonePB;
    private javax.swing.JButton btnSavePB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1000Free;
    private javax.swing.JLabel lbl100Back;
    private javax.swing.JLabel lbl100Breast;
    private javax.swing.JLabel lbl100Fly;
    private javax.swing.JLabel lbl100Free;
    private javax.swing.JLabel lbl100IM;
    private javax.swing.JPanel lbl200Back;
    private javax.swing.JLabel lbl200Breast;
    private javax.swing.JLabel lbl200Fly;
    private javax.swing.JLabel lbl200Free;
    private javax.swing.JLabel lbl200IM;
    private javax.swing.JLabel lbl400Free;
    private javax.swing.JLabel lbl400IM;
    private javax.swing.JLabel lbl50Back;
    private javax.swing.JLabel lbl50Fly;
    private javax.swing.JLabel lbl50Free;
    private javax.swing.JLabel lbl800Free;
    private javax.swing.JLabel lblColon10;
    private javax.swing.JLabel lblColon11;
    private javax.swing.JLabel lblColon12;
    private javax.swing.JLabel lblColon13;
    private javax.swing.JLabel lblColon14;
    private javax.swing.JLabel lblColon15;
    private javax.swing.JLabel lblColon16;
    private javax.swing.JLabel lblColon17;
    private javax.swing.JLabel lblColon18;
    private javax.swing.JLabel lblColon19;
    private javax.swing.JLabel lblColon20;
    private javax.swing.JLabel lblColon21;
    private javax.swing.JLabel lblColon22;
    private javax.swing.JLabel lblColon23;
    private javax.swing.JLabel lblColon24;
    private javax.swing.JLabel lblColon25;
    private javax.swing.JLabel lblColon26;
    private javax.swing.JLabel lblColon27;
    private javax.swing.JLabel lblColon28;
    private javax.swing.JLabel lblColon29;
    private javax.swing.JLabel lblColon30;
    private javax.swing.JLabel lblColon31;
    private javax.swing.JLabel lblColon32;
    private javax.swing.JLabel lblColon33;
    private javax.swing.JLabel lblColon34;
    private javax.swing.JLabel lblColon35;
    private javax.swing.JLabel lblColon36;
    private javax.swing.JLabel lblColon37;
    private javax.swing.JLabel lblColon38;
    private javax.swing.JLabel lblColon39;
    private javax.swing.JLabel lblColon4;
    private javax.swing.JLabel lblColon5;
    private javax.swing.JLabel lblColon6;
    private javax.swing.JLabel lblColon7;
    private javax.swing.JLabel lblColon8;
    private javax.swing.JLabel lblColon9;
    private javax.swing.JLabel lblNamePB;
    private javax.swing.JLabel lblNamePB10;
    private javax.swing.JLabel lblNamePB4;
    private javax.swing.JLabel lblPersonalBests;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JSpinner spnBK100Milli;
    private javax.swing.JSpinner spnBK100Mins;
    private javax.swing.JSpinner spnBK100Secs;
    private javax.swing.JSpinner spnBK200Milli;
    private javax.swing.JSpinner spnBK200Mins;
    private javax.swing.JSpinner spnBK200Secs;
    private javax.swing.JSpinner spnBK50Milli;
    private javax.swing.JSpinner spnBK50Mins;
    private javax.swing.JSpinner spnBK50Secs;
    private javax.swing.JSpinner spnBR100Milli;
    private javax.swing.JSpinner spnBR100Mins;
    private javax.swing.JSpinner spnBR100Secs;
    private javax.swing.JSpinner spnBR200Milli;
    private javax.swing.JSpinner spnBR200Mins;
    private javax.swing.JSpinner spnBR200Secs;
    private javax.swing.JSpinner spnBR50Milli;
    private javax.swing.JSpinner spnBR50Mins;
    private javax.swing.JSpinner spnBR50Secs;
    private javax.swing.JSpinner spnFL100Milli;
    private javax.swing.JSpinner spnFL100Mins;
    private javax.swing.JSpinner spnFL100Secs;
    private javax.swing.JSpinner spnFL200Milli;
    private javax.swing.JSpinner spnFL200Mins;
    private javax.swing.JSpinner spnFL200Secs;
    private javax.swing.JSpinner spnFL50Milli;
    private javax.swing.JSpinner spnFL50Mins;
    private javax.swing.JSpinner spnFL50Secs;
    private javax.swing.JSpinner spnFR1000Milli;
    private javax.swing.JSpinner spnFR1000Mins;
    private javax.swing.JSpinner spnFR1000Secs;
    private javax.swing.JSpinner spnFR100Milli;
    private javax.swing.JSpinner spnFR100Mins;
    private javax.swing.JSpinner spnFR100Secs;
    private javax.swing.JSpinner spnFR200Milli;
    private javax.swing.JSpinner spnFR200Mins;
    private javax.swing.JSpinner spnFR200Secs;
    private javax.swing.JSpinner spnFR400Milli;
    private javax.swing.JSpinner spnFR400Mins;
    private javax.swing.JSpinner spnFR400Secs;
    private javax.swing.JSpinner spnFR50Milli;
    private javax.swing.JSpinner spnFR50Mins;
    private javax.swing.JSpinner spnFR50Secs;
    private javax.swing.JSpinner spnFR800Milli;
    private javax.swing.JSpinner spnFR800Mins;
    private javax.swing.JSpinner spnFR800Secs;
    private javax.swing.JSpinner spnIM100Milli;
    private javax.swing.JSpinner spnIM100Mins;
    private javax.swing.JSpinner spnIM100Secs;
    private javax.swing.JSpinner spnIM200Milli;
    private javax.swing.JSpinner spnIM200Mins;
    private javax.swing.JSpinner spnIM200Secs;
    private javax.swing.JSpinner spnIM400Milli;
    private javax.swing.JSpinner spnIM400Mins;
    private javax.swing.JSpinner spnIM400Secs;
    private javax.swing.JTextField txtfldName;
    // End of variables declaration//GEN-END:variables
}
