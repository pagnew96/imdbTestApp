import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class resultChoice extends javax.swing.JFrame implements ActionListener {

    private javax.swing.JTextArea displayText;
    private JComboBox<String> userChoice;
    private Result[] results;
    private boolean directorFlag;
    private int low, high;


    /**
     * Creates new form resultChoice
     */
    public resultChoice(Result[] results, boolean directorFlag, int low, int high) {
        this.setResults(results);
        this.setDirectorFlag(directorFlag);
        this.setLow(low);
        this.setHigh(high);

        initComponents();
        this.setVisible(true);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JScrollPane jScrollPane1 = new JScrollPane();
        displayText = new javax.swing.JTextArea();
        userChoice = new JComboBox<>();
        JButton returnButton = new JButton();
        JButton newSearchButton = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(62, 120, 207));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 360, 60));

        jPanel2.setBackground(new java.awt.Color(23, 35, 55));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 320));

        jPanel3.setBackground(new java.awt.Color(245, 247, 253));

        displayText.setEditable(false);
        displayText.setBackground(new java.awt.Color(245, 247, 253));
        displayText.setColumns(20);
        displayText.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 14)); // NOI18N
        displayText.setLineWrap(true);
        displayText.setRows(5);
        displayText.setText("The name you entered returned multiple results so either you can't spell, like a dumbass. Or there may be multiple people with that name what a shocker. Or you entered something ominously vaugue. \nPlease choose the Actor or director you were trying to search:");
        displayText.setWrapStyleWord(true);
        displayText.setAutoscrolls(false);
        displayText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jScrollPane1.setViewportView(displayText);

        returnButton.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 14));
        returnButton.setText("Search");
        returnButton.addActionListener(this);
        returnButton.setActionCommand("search");

        newSearchButton.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 14));
        newSearchButton.setText("New Search");
        newSearchButton.addActionListener(this);
        newSearchButton.setActionCommand("newSearch");

        for (Result r : results) {
            userChoice.addItem(r.getName());
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                        .addComponent(userChoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(newSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                        .addComponent(newSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                        )
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 360, 260));

        pack();
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        int index = userChoice.getSelectedIndex();
        Person person = meanMovieAdviser.mapPerson(Integer.toString(results[index].getId()));

        switch (cmd) {
            case "search":
                if (directorFlag) {
                    if (meanMovieAdviser.getRangeCrew(person, high, low) != null) {
                        new displayForm(person, directorFlag, low, high);
                        this.setVisible(false);
                    } else {
                        displayText.setText(meanMovieAdviser.notDirString);
                    }
                } else {
                    if (meanMovieAdviser.getRangeCast(person, high, low) != null) {
                        new displayForm(person, directorFlag, low, high);
                        this.setVisible(false);
                    } else {
                        displayText.setText(meanMovieAdviser.notActorString);
                    }
                }
                break;

            case "newSearch":
                new home().setVisible(true);
                this.setVisible(false);
                break;

            default:
                break;
        }

    }

    public void setResults(Result[] results) {
        this.results = results;
    }

    public void setDirectorFlag(boolean directorFlag) {
        this.directorFlag = directorFlag;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}

