package emmastewartgui;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author Emma
 */
public class ESGuiRunWorkout extends javax.swing.JDialog {

    EmmaStewartGUI manager;
    ESSet setDetails;
    ESWorkout workoutDetails;

    public ESGuiRunWorkout(java.awt.Frame parent, String ItemClicked, boolean modal) {
        super(parent, modal);
        initComponents();
        System.out.println("The timer now is working!");
        lblNameWorkout.setText(ItemClicked);
//        countdownToWorkout();
       // runWorkout();
        //this.setDetails = setDetails;
        //if (setDetails.setTimeMins < 10) {
          //  lblMinsTime.setText(String.valueOf("0" + setDetails.setTimeMins));
        //} else {
          //  lblMinsTime.setText(String.valueOf(setDetails.setTimeMins));
        //}
        //if (setDetails.setTimeSecs < 10) {
          //  lblSecsTime.setText(String.valueOf("0" + setDetails.setTimeSecs));
        //} else {
          //  lblSecsTime.setText(String.valueOf(setDetails.setTimeSecs));
       // }
        //Code above simply standerdizes the values retrieved from the database to appear in MM:SS
        //start();
    }
    
    public void pop() {
        System.out.println("Test");
    }

    public void runWorkout() {
        ESSet setDetails = new ESSet();
        ESWorkout workoutDetails = new ESWorkout();

//        while (rs.next()) {
//                for (int i = 0; i < 20; i++) {
//                    workoutNames[i] = rs.getString(variable);
//                }
//                itemCount++;
//            }
        //Set the Workout Name Label to be what is saved in the database:
        lblNameWorkout.setText(workoutDetails.workoutName); //Doesn't cause errors, but shows up as null. 
        System.out.println("workoutName: " + workoutDetails.workoutName);

        //Print the instructions:
        lblInstructions.setText(String.valueOf((setDetails.numOfLaps) + " x " + String.valueOf(setDetails.setDis) + " m "
                + setDetails.strokeType + " on " + String.valueOf(setDetails.setTimeMins) + ":" + String.valueOf(setDetails.setTimeSecs)));

        // Then print the description:
        lblSetDescription.setText(setDetails.setDescription);

        String workoutID = manager.selectItem("Workout", "workoutID", "workoutID", workoutDetails.workoutName);
        //PreparedStatement pst = new EmmaStewartGUI().connect().prepareStatement(sql);
        int intWorkoutID = Integer.parseInt(workoutID);
        //ResultSet rs = pst.executeQuery();
        //int rsID = rs.getString();

        //While the workout ID is what is gotten from the DB
        //while (intWorkoutID == setDetails.workoutID) {
            /* Run one set the number of times specified in  the numOfLaps. 
            When it's done, move onto the next set, get all the data and do 
            that until the workoutID is no longer equal to the one selected from the list */
            //runOneSet();
       // }

        /*      int numOfLaps = setDetails.numOfLaps;
        while (workoutID = workoutDetails.workoutID){
                run();
            if (setDetails.setTimeMins == 0 && setDetails.setTimeSecs == 0){
                numOfLaps--;
                }
            if (numOfaps == 0){
                (rs.next){
                    Get the next set's data --> run according to the numOfLaps there (will 
                    I have to make a bunch of queries again? And then set them to the object?)
                    I might have to make a new selectAll method
                }
            }
        }   */
    }

   // public void runOneSet() {
     //   String idString = String.valueOf(setDetails.setID);
     //   String nOl = manager.selectItem("Sets", "numOfLaps", "workoutID", idString);
     //   int nOL = Integer.valueOf(nOl);
      //  for (int i = 0; i < nOL + 1; i++) {
        //    task.run();
       // }
   // }

    int secondsPassed = 0;
    Timer myTimer = new Timer();
    //Instantiating the timer because no timer (or the import) exists until then

    TimerTask task = new TimerTask() {
        //Using the import to run the timer
        public void run() {
            if (setDetails.setTimeMins >= 0) {
                secondsPassed++;
                if (setDetails.setTimeSecs == 0 && setDetails.setTimeMins != 0) {
                    setDetails.setTimeSecs = 60;
                    setDetails.setTimeMins--;

                    lblMinsTime.setText(String.valueOf(setDetails.setTimeMins));
                    //If the seocnds are = 0, but the mins are not, set the seconds to 60 and take away a minute
                } else {
                    lblMinsTime.setText(String.valueOf(setDetails.setTimeMins));
                    //Otherwise, keep updating the labels to be the current time
                }
                setDetails.setTimeSecs--;
                //Always countdown the seconds
            }
            int secs = setDetails.setTimeSecs;
            String secsString = String.valueOf(secs);
            if (setDetails.setTimeMins < 10) {
                lblMinsTime.setText(String.valueOf("0" + setDetails.setTimeMins));
            }
            if (secs < 10) {
                secsString = "0" + secsString;
            }
            lblSecsTime.setText(secsString);
            //Standerdizing code for the running timer to appear in MM:SS
            if (setDetails.setTimeMins == 0 && setDetails.setTimeSecs == 0) {
                stop();
            }
        }
    };

    public void start() {
        myTimer.scheduleAtFixedRate(task, 1000, 1000);
    }

    public void stop() {
        System.out.println("Timer is over");
        myTimer.cancel();
    }

    public void countdownToWorkout() {
        //I want to run this code before the actual workout starts
        //Make a new dialogue? 
        int seconds = 10;
        while (seconds >= 0) {
            if (seconds < 10) {
                lblSecsTime.setText(String.valueOf("0" + setDetails.setTimeSecs));
            }
            lblInstructions.setText("Preparing workout..");
        }
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSetDescription = new javax.swing.JLabel();
        lblInstructions = new javax.swing.JLabel();
        lblNameWorkout = new javax.swing.JLabel();
        btnPause = new javax.swing.JButton();
        lblColon = new javax.swing.JLabel();
        lblSecsTime = new javax.swing.JLabel();
        lblMinsTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSetDescription.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblSetDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSetDescription.setText("Set Description");

        lblInstructions.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblInstructions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructions.setText("Instructions");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstructions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSetDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 1202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSetDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );

        lblNameWorkout.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblNameWorkout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameWorkout.setText("Name of Workout");

        btnPause.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnPause.setText("PAUSE");
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        lblColon.setFont(new java.awt.Font("Tahoma", 0, 450)); // NOI18N
        lblColon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColon.setText(":");

        lblSecsTime.setFont(new java.awt.Font("Tahoma", 0, 450)); // NOI18N
        lblSecsTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSecsTime.setText("00");

        lblMinsTime.setFont(new java.awt.Font("Tahoma", 0, 450)); // NOI18N
        lblMinsTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinsTime.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(lblNameWorkout, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMinsTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblColon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSecsTime, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNameWorkout, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnPause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblColon, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblSecsTime, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMinsTime, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        
        pop();
        
        String[] buttons = {"Continue", "Quit workout"};
        //Give options to be pressed
        int rc = JOptionPane.showOptionDialog(null, "Paused", "Menu", JOptionPane.PLAIN_MESSAGE, 0, null, buttons, buttons[0]);
        //Display the message with a message name, header, and buttons to be pressed

        if (rc == 1) {
            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit this workout in session?", "Quit", JOptionPane.YES_NO_CANCEL_OPTION);
            //If user decides to quit workout, make sure that they for sure want to
            if (p == 0) {
                this.dispose();
                //Close the workout dialogue too
            } else {
                //Does nothing and closes the pop-up. 
            }
        }
    }//GEN-LAST:event_btnPauseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPause;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblColon;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblMinsTime;
    private javax.swing.JLabel lblNameWorkout;
    private javax.swing.JLabel lblSecsTime;
    private javax.swing.JLabel lblSetDescription;
    // End of variables declaration//GEN-END:variables
}
