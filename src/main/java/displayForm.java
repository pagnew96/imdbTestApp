import kong.unirest.Unirest;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Padraic
 */
public class displayForm extends javax.swing.JFrame implements ActionListener {

    private javax.swing.JTextArea jTextArea1;

    private Person person;
    private Boolean crewFlag;
    private int rangeLow;
    private int rangeHigh;
    private int movieCounter = 0;
    private genre[] genres;
    private Crew[] dirMovies;
    private Cast[] actorMovies;

    /**
     * Creates new form displayForm
     */
    public displayForm(Person person, Boolean crewFlag, int rangeLow, int rangeHigh) {
        this.setPerson(person);
        this.setCrewFlag(crewFlag);
        this.setRangeLow(rangeLow);
        this.setRangeHigh(rangeHigh);

        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {

        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel9 = new JLabel();
        JLabel jLabel10 = new JLabel();
        JLabel jLabel11 = new JLabel();
        JLabel jLabel12 = new JLabel();
        JLabel jLabel13 = new JLabel();
        JLabel jLabel14 = new JLabel();
        JLabel jLabel15 = new JLabel();
        JLabel jLabel16 = new JLabel();
        JLabel jLabel17 = new JLabel();
        JLabel jLabel18 = new JLabel();
        JLabel jLabel19 = new JLabel();
        JLabel jLabel20 = new JLabel();
        JLabel jLabel21 = new JLabel();
        JLabel jLabel22 = new JLabel();
        JLabel jLabel23 = new JLabel();
        JLabel jLabel24 = new JLabel();
        JLabel jLabel25 = new JLabel();
        JLabel jLabel26 = new JLabel();
        JLabel jLabel27 = new JLabel();
        JLabel jLabel28 = new JLabel();
        JLabel jLabel29 = new JLabel();
        JPanel jPanel2 = new JPanel();
        JButton forwardButton = new JButton();
        JButton backButton = new JButton();
        JButton searchButton = new JButton();
        JScrollPane jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));
        setMinimumSize(new Dimension(860, 510));

        jPanel1.setLayout(new AbsoluteLayout());

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel1, new AbsoluteConstraints(780, 390, 130, -1));

        jLabel2.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel2, new AbsoluteConstraints(0, 0, 130, -1));

        jLabel3.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel3, new AbsoluteConstraints(130, 0, 130, -1));

        jLabel4.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel4, new AbsoluteConstraints(260, 0, 130, -1));

        jLabel5.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel5, new AbsoluteConstraints(390, 0, 130, -1));

        jLabel6.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel6, new AbsoluteConstraints(520, 0, 130, -1));

        jLabel7.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel7, new AbsoluteConstraints(650, 0, 130, -1));

        jLabel8.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel8, new AbsoluteConstraints(780, 0, 130, -1));

        jLabel9.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel9, new AbsoluteConstraints(0, 130, 130, -1));

        jLabel10.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel10, new AbsoluteConstraints(0, 260, 130, -1));

        jLabel11.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel11, new AbsoluteConstraints(0, 390, 130, -1));

        jLabel12.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel12, new AbsoluteConstraints(130, 130, 130, -1));

        jLabel13.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel13, new AbsoluteConstraints(130, 260, 130, -1));

        jLabel14.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel14, new AbsoluteConstraints(130, 390, 130, -1));

        jLabel15.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel15, new AbsoluteConstraints(260, 130, 130, -1));

        jLabel16.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel16, new AbsoluteConstraints(260, 260, 130, -1));

        jLabel17.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel17, new AbsoluteConstraints(260, 390, 130, -1));

        jLabel18.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel18, new AbsoluteConstraints(390, 130, 130, -1));

        jLabel19.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel19, new AbsoluteConstraints(390, 260, 130, -1));

        jLabel20.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel20, new AbsoluteConstraints(390, 390, 130, -1));

        jLabel21.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel21, new AbsoluteConstraints(520, 130, 130, -1));

        jLabel22.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel22, new AbsoluteConstraints(520, 260, 130, -1));

        jLabel23.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel23, new AbsoluteConstraints(520, 260, 130, -1));

        jLabel24.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel24, new AbsoluteConstraints(520, 390, 130, -1));

        jLabel25.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel25, new AbsoluteConstraints(650, 130, 130, -1));

        jLabel26.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel26, new AbsoluteConstraints(650, 260, 130, -1));

        jLabel27.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel27, new AbsoluteConstraints(650, 390, 130, -1));

        jLabel28.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel28, new AbsoluteConstraints(780, 130, 130, -1));

        jLabel29.setIcon(new ImageIcon(getClass().getResource("/yes.png")));
        jPanel1.add(jLabel29, new AbsoluteConstraints(780, 260, 130, -1));

        jPanel2.setBackground(new Color(255, 255, 255, 0));

        forwardButton.setFont(new Font("Times New Roman", Font.BOLD, 18)); // NOI18N
        forwardButton.setText(">");
        forwardButton.addActionListener(this);
        forwardButton.setActionCommand("forward");

        backButton.setFont(new Font("Times New Roman", Font.BOLD, 18)); // NOI18N
        backButton.setText("<");
        backButton.addActionListener(this);
        backButton.setActionCommand("back");

        searchButton.setFont(new Font("Times New Roman", Font.BOLD, 14)); // NOI18N
        searchButton.setText("New Search");
        searchButton.addActionListener(this);
        searchButton.setActionCommand("newSearch");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        Font f = jTextArea1.getFont();
        Font f1 = new Font(f.getFontName(), f.getStyle(), f.getSize() + 3);
        jTextArea1.setFont(f1);
        jScrollPane1.setViewportView(jTextArea1);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(searchButton)
                                                .addContainerGap())
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(forwardButton)
                                                .addGap(34, 34, 34))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jScrollPane1))
                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(248, Short.MAX_VALUE)
                                                .addComponent(forwardButton)
                                                .addGap(181, 181, 181)
                                                .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(backButton)
                                .addGap(243, 243, 243))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        genreSearch response = Unirest.get("https://api.themoviedb.org/3/genre/movie/list?" +
                "api_key=a13aa4b431ad2e32be56ad47bcb70469&language=en-US")
                .asObject(genreSearch.class).getBody();
        Unirest.shutDown();

        genres = response.getGenres();

        if (crewFlag) {
            dirMovies = meanMovieAdviser.getRangeCrew(person, rangeHigh, rangeLow);
            printCrew(dirMovies[movieCounter]);
        } else {
            actorMovies = meanMovieAdviser.getRangeCast(person, rangeHigh, rangeLow);
            printCast(actorMovies[movieCounter]);
        }

        pack();
        this.setLocationRelativeTo(null);
    }

    private void printCast(Cast movie) {
        int[] genreId = movie.getGenre_ids();
        jTextArea1.setText("");

        jTextArea1.append("The title of the movie: " + movie.getTitle() + "\n\n");
        jTextArea1.append("Movie genres: ");
        for (int value : genreId) {
            for (genre genre : genres) {
                if (value == genre.getId()) {
                    jTextArea1.append(genre.getName() + ", ");
                }
            }
        }
        jTextArea1.append("\n\n");
        jTextArea1.append("An overview of the movie: " + movie.getOverview() + "\n\n");
        jTextArea1.append("Average rating out of 10: \t" + movie.getVote_average() + "/10" + "\n");
    }

    private void printCrew(Crew movie) {
        int[] genreId = movie.getGenre_ids();
        jTextArea1.setText("");

        jTextArea1.append("The title of the movie: " + movie.getTitle() + "\n\n");
        jTextArea1.append("Movie genres: ");
        for (int value : genreId) {
            for (genre genre : genres) {
                if (value == genre.getId()) {
                    jTextArea1.append(genre.getName() + ", ");
                }
            }
        }
        jTextArea1.append("\n\n");
        jTextArea1.append("An overview of the movie: " + movie.getOverview() + "\n\n");
        jTextArea1.append("Average rating out of 10: \t" + movie.getVote_average() + "/10" + "\n");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        switch (cmd) {
            case "back":
                if (movieCounter > 0)
                    movieCounter--;
                else
                    movieCounter = meanMovieAdviser.getRangeMovieLength() - 1;

                if (crewFlag)
                    printCrew(dirMovies[movieCounter]);
                else
                    printCast(actorMovies[movieCounter]);

                break;
            case "forward":
                if (movieCounter == meanMovieAdviser.getRangeMovieLength() - 1)
                    movieCounter = 0;
                else
                    movieCounter++;

                if (crewFlag)
                    printCrew(dirMovies[movieCounter]);
                else
                    printCast(actorMovies[movieCounter]);

                break;

            case "newSearch":
                new home().setVisible(true);
                this.setVisible(false);

            default:
                break;
        }
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setCrewFlag(Boolean crewFlag) {
        this.crewFlag = crewFlag;
    }

    public void setRangeLow(int rangeLow) {
        this.rangeLow = rangeLow;
    }

    public void setRangeHigh(int rangeHigh) {
        this.rangeHigh = rangeHigh;
    }
}
