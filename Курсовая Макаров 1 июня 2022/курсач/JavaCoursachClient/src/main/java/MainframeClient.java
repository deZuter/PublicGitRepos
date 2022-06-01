
import java.awt.*;
import java.net.*;

import java.io.*;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class MainframeClient extends javax.swing.JFrame 
{
    public MainframeClient() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RulesDialogWindow = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        RulesButtonOk = new javax.swing.JButton();
        GameResultPanel = new javax.swing.JDialog();
        GameOverLabel = new javax.swing.JLabel();
        ScoreLabel = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        YourPointsLabel = new javax.swing.JLabel();
        EnemyPointsLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GameResultPanelOkButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        mainMenuPanel = new javax.swing.JPanel();
        mainMenuLabel = new javax.swing.JLabel();
        mainMenuStartButton = new javax.swing.JButton();
        mainMenuSignature = new javax.swing.JLabel();
        mainMenuIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RulesButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        connectingPanel = new javax.swing.JPanel();
        connectingLabel = new javax.swing.JLabel();
        gamePanel = new javax.swing.JPanel();
        gameYourPick = new javax.swing.JLabel();
        gameRockChooser = new javax.swing.JLabel();
        gamePaperChooser = new javax.swing.JLabel();
        gameScissorsChooser = new javax.swing.JLabel();
        gameEnemyPick = new javax.swing.JLabel();
        gameYouLabel = new javax.swing.JLabel();
        gameEnemyLabel = new javax.swing.JLabel();
        gameYourPoints = new javax.swing.JLabel();
        gameDashLabel = new javax.swing.JLabel();
        gameEnemyPoints = new javax.swing.JLabel();
        gameSendButton = new javax.swing.JButton();

        RulesDialogWindow.setBackground(new java.awt.Color(201, 63, 65));
        RulesDialogWindow.setSize(new java.awt.Dimension(370, 400));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Лабораторные работы\\3 курс\\2 семак\\java вар 9\\курсач\\JavaCoursachClient\\Rules.png")); // NOI18N

        RulesButtonOk.setText("Все понятно!");
        RulesButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RulesButtonOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RulesDialogWindowLayout = new javax.swing.GroupLayout(RulesDialogWindow.getContentPane());
        RulesDialogWindow.getContentPane().setLayout(RulesDialogWindowLayout);
        RulesDialogWindowLayout.setHorizontalGroup(
            RulesDialogWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RulesDialogWindowLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(RulesButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addComponent(jLabel2)
        );
        RulesDialogWindowLayout.setVerticalGroup(
            RulesDialogWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RulesDialogWindowLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RulesButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        GameResultPanel.setBackground(new java.awt.Color(201, 159, 49));
        GameResultPanel.setMinimumSize(new java.awt.Dimension(410, 260));
        GameResultPanel.setPreferredSize(new java.awt.Dimension(410, 260));
        GameResultPanel.setSize(new java.awt.Dimension(410, 260));

        GameOverLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GameOverLabel.setText("Игра окончена!");

        ScoreLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ScoreLabel.setText("Счет:");

        jLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel.setText("-");

        YourPointsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        EnemyPointsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Вы");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Противник");

        GameResultPanelOkButton.setText("Ок");
        GameResultPanelOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameResultPanelOkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GameResultPanelLayout = new javax.swing.GroupLayout(GameResultPanel.getContentPane());
        GameResultPanel.getContentPane().setLayout(GameResultPanelLayout);
        GameResultPanelLayout.setHorizontalGroup(
            GameResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameResultPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(GameResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(YourPointsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jLabel)
                .addGap(54, 54, 54)
                .addGroup(GameResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(EnemyPointsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(GameResultPanelLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(ScoreLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameResultPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GameResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameResultPanelLayout.createSequentialGroup()
                        .addComponent(GameOverLabel)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GameResultPanelLayout.createSequentialGroup()
                        .addComponent(GameResultPanelOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))))
        );
        GameResultPanelLayout.setVerticalGroup(
            GameResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GameResultPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(GameOverLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScoreLabel)
                .addGap(6, 6, 6)
                .addGroup(GameResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(GameResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(YourPointsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel)
                    .addComponent(EnemyPointsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GameResultPanelOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setPreferredSize(new java.awt.Dimension(542, 412));
        mainPanel.setLayout(new java.awt.CardLayout());

        mainMenuPanel.setBackground(new java.awt.Color(201, 159, 49));
        mainMenuPanel.setPreferredSize(new java.awt.Dimension(530, 330));

        mainMenuLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mainMenuLabel.setForeground(new java.awt.Color(0, 0, 0));
        mainMenuLabel.setText("Камень, ножницы, бумага");

        mainMenuStartButton.setText("Старт");
        mainMenuStartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuStartButtonActionPerformed(evt);
            }
        });

        mainMenuSignature.setBackground(new java.awt.Color(0, 0, 0));
        mainMenuSignature.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        mainMenuSignature.setForeground(new java.awt.Color(0, 0, 0));
        mainMenuSignature.setText("Выполнил студент 19ВВ2 Макаров Дмитрий");

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Лабораторные работы\\3 курс\\2 семак\\java вар 9\\курсач\\JavaCoursachClient\\main icon.png")); // NOI18N
        jLabel1.setText("jLabel1");

        RulesButton.setText("Правила игры");
        RulesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RulesButtonMouseClicked(evt);
            }
        });
        RulesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RulesButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Выход");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuPanelLayout = new javax.swing.GroupLayout(mainMenuPanel);
        mainMenuPanel.setLayout(mainMenuPanelLayout);
        mainMenuPanelLayout.setHorizontalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mainMenuSignature, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainMenuPanelLayout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(mainMenuIcon))
                        .addGroup(mainMenuPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mainMenuStartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RulesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(mainMenuPanelLayout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(mainMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainMenuPanelLayout.setVerticalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(mainMenuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainMenuIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(mainMenuPanelLayout.createSequentialGroup()
                        .addComponent(mainMenuStartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RulesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(mainMenuSignature)
                .addGap(33, 33, 33))
        );

        mainPanel.add(mainMenuPanel, "card2");

        connectingPanel.setBackground(new java.awt.Color(201, 159, 49));
        connectingPanel.setPreferredSize(new java.awt.Dimension(542, 412));

        connectingLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        connectingLabel.setForeground(new java.awt.Color(0, 0, 0));
        connectingLabel.setText("Connecting...");

        javax.swing.GroupLayout connectingPanelLayout = new javax.swing.GroupLayout(connectingPanel);
        connectingPanel.setLayout(connectingPanelLayout);
        connectingPanelLayout.setHorizontalGroup(
            connectingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, connectingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(connectingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        connectingPanelLayout.setVerticalGroup(
            connectingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, connectingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(connectingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );

        mainPanel.add(connectingPanel, "card3");

        gamePanel.setBackground(new java.awt.Color(201, 159, 49));
        gamePanel.setPreferredSize(new java.awt.Dimension(545, 412));

        gameYourPick.setToolTipText("");

        gameRockChooser.setIcon(new javax.swing.ImageIcon("D:\\Лабораторные работы\\3 курс\\2 семак\\java вар 9\\курсач\\JavaCoursachClient\\rock_2 (2).png")); // NOI18N
        gameRockChooser.setText("Rock");
        gameRockChooser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gameRockChooser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gameRockChooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gameRockChooserMouseClicked(evt);
            }
        });

        gamePaperChooser.setIcon(new javax.swing.ImageIcon("D:\\Лабораторные работы\\3 курс\\2 семак\\java вар 9\\курсач\\JavaCoursachClient\\paper_2 (2).png")); // NOI18N
        gamePaperChooser.setText("Paper");
        gamePaperChooser.setToolTipText("");
        gamePaperChooser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gamePaperChooser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gamePaperChooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gamePaperChooserMouseClicked(evt);
            }
        });

        gameScissorsChooser.setIcon(new javax.swing.ImageIcon("D:\\Лабораторные работы\\3 курс\\2 семак\\java вар 9\\курсач\\JavaCoursachClient\\scissors_2 (2).png")); // NOI18N
        gameScissorsChooser.setText("Scissors");
        gameScissorsChooser.setToolTipText("");
        gameScissorsChooser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gameScissorsChooser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gameScissorsChooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gameScissorsChooserMouseClicked(evt);
            }
        });

        gameEnemyPick.setToolTipText("");

        gameYouLabel.setForeground(new java.awt.Color(0, 0, 0));
        gameYouLabel.setText("You");

        gameEnemyLabel.setForeground(new java.awt.Color(0, 0, 0));
        gameEnemyLabel.setText("Enemy");

        gameYourPoints.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        gameYourPoints.setForeground(new java.awt.Color(0, 0, 0));
        gameYourPoints.setText("0");

        gameDashLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        gameDashLabel.setForeground(new java.awt.Color(0, 0, 0));
        gameDashLabel.setText("-");

        gameEnemyPoints.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        gameEnemyPoints.setForeground(new java.awt.Color(0, 0, 0));
        gameEnemyPoints.setText("0");

        gameSendButton.setText("Send");
        gameSendButton.setActionCommand("");
        gameSendButton.setEnabled(false);
        gameSendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameSendButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameYouLabel)
                    .addComponent(gameYourPick, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameEnemyLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gameEnemyPick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(gameYourPoints)
                .addGap(52, 52, 52)
                .addComponent(gameDashLabel)
                .addGap(46, 46, 46)
                .addComponent(gameEnemyPoints)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                        .addComponent(gameRockChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(gamePaperChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(gameScissorsChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                        .addComponent(gameSendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameYourPoints, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gameDashLabel)
                        .addComponent(gameEnemyPoints)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gameYouLabel)
                    .addComponent(gameEnemyLabel))
                .addGap(18, 18, 18)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gameYourPick, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameEnemyPick, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gamePaperChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameScissorsChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gameRockChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(gameSendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        gameYourPick.getAccessibleContext().setAccessibleName("gameYourPick");
        gameEnemyPick.getAccessibleContext().setAccessibleName("");

        mainPanel.add(gamePanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private static Socket clientSocket; //сокет для общения
    private static BufferedReader in; // поток чтения из сокета
    private static BufferedWriter out; // поток записи в сокет

    boolean isRockChoosed = false;
    boolean isPaperChoosed = false;
    boolean isScissorsChoosed = false;
    javax.swing.ImageIcon YourPaper = new javax.swing.ImageIcon("D:\\Лабораторные работы\\3 курс\\2 семак\\java вар 9\\курсач\\JavaCoursachClient\\paper_2_Your.png");
    javax.swing.ImageIcon YourRock = new javax.swing.ImageIcon("D:\\Лабораторные работы\\3 курс\\2 семак\\java вар 9\\курсач\\JavaCoursachClient\\rock_2_Your.png");
    javax.swing.ImageIcon YourScissors = new javax.swing.ImageIcon("D:\\Лабораторные работы\\3 курс\\2 семак\\java вар 9\\курсач\\JavaCoursachClient\\scissors_2_Your.png");


    javax.swing.ImageIcon EnemyPaper = new javax.swing.ImageIcon("D:\\Лабораторные работы\\3 курс\\2 семак\\java вар 9\\курсач\\JavaCoursachClient\\paper_2_Enemy.png");

    javax.swing.ImageIcon EnemyRock = new javax.swing.ImageIcon("D:\\Лабораторные работы\\3 курс\\2 семак\\java вар 9\\курсач\\JavaCoursachClient\\rock_2_Enemy.png");

    javax.swing.ImageIcon EnemyScissors = new javax.swing.ImageIcon("D:\\Лабораторные работы\\3 курс\\2 семак\\java вар 9\\курсач\\JavaCoursachClient\\scissors_2_Enemy.png");
    
    
    
    private void gameRockChooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gameRockChooserMouseClicked
        if(gameRockChooser.isEnabled())
        {
            Border loweredBorder, raisedBorder;
            raisedBorder = BorderFactory.createRaisedBevelBorder();
            loweredBorder = BorderFactory.createLoweredBevelBorder();
            gameRockChooser.setBorder(loweredBorder);
            gamePaperChooser.setBorder(raisedBorder);
            gameScissorsChooser.setBorder(raisedBorder);
            isRockChoosed = true;
            isPaperChoosed = false;
            isScissorsChoosed = false;
            gameSendButton.setEnabled(true);
            gameYourPick.setIcon(YourRock);
        }
    }//GEN-LAST:event_gameRockChooserMouseClicked

    private void gamePaperChooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gamePaperChooserMouseClicked
        if(gamePaperChooser.isEnabled()) {
            Border loweredBorder, raisedBorder;
            raisedBorder = BorderFactory.createRaisedBevelBorder();
            loweredBorder = BorderFactory.createLoweredBevelBorder();
            gameRockChooser.setBorder(raisedBorder);
            gamePaperChooser.setBorder(loweredBorder);
            gameScissorsChooser.setBorder(raisedBorder);
            isRockChoosed = false;
            isPaperChoosed = true;
            isScissorsChoosed = false;
            gameSendButton.setEnabled(true);
            gameYourPick.setIcon(YourPaper);
        }
    }//GEN-LAST:event_gamePaperChooserMouseClicked

    private void gameScissorsChooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gameScissorsChooserMouseClicked
        if(gameScissorsChooser.isEnabled())
        {
            Border loweredBorder, raisedBorder;
            raisedBorder = BorderFactory.createRaisedBevelBorder();
            loweredBorder = BorderFactory.createLoweredBevelBorder();
            gameRockChooser.setBorder(raisedBorder);
            gamePaperChooser.setBorder(raisedBorder);
            gameScissorsChooser.setBorder(loweredBorder);
            isRockChoosed = false;
            isPaperChoosed = false;
            isScissorsChoosed = true;
            gameSendButton.setEnabled(true);
            gameYourPick.setIcon(YourScissors);
        }
    }//GEN-LAST:event_gameScissorsChooserMouseClicked

    private void gameSendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameSendButtonActionPerformed
        try {

            if (isPaperChoosed == true)
            {
                out.write("paper" + "\n");
            } else if (isRockChoosed == true)
            {
                out.write("rock" + "\n");
            } else {
                out.write("scissors" + "\n");
            }
            out.flush();

            gameSendButton.setEnabled(false);
            gameRockChooser.setEnabled(false);
            gamePaperChooser.setEnabled(false);
            gameScissorsChooser.setEnabled(false);

            String result = in.readLine();

            if (Objects.equals(result, "win"))
            {
                gameYourPoints.setText(in.readLine());
                if (isPaperChoosed == true)
                {
                    gameEnemyPick.setIcon(EnemyRock);
                }
                else if (isRockChoosed == true)
                {
                    gameEnemyPick.setIcon(EnemyScissors);
                }
                else if (isScissorsChoosed == true)
                {
                    gameEnemyPick.setIcon(EnemyPaper);
                }

            }

            if (Objects.equals(result, "lose"))
            {
                gameEnemyPoints.setText(in.readLine());
                if (isPaperChoosed == true)
                {
                    gameEnemyPick.setIcon(EnemyScissors);
                }
                else if (isRockChoosed == true)
                {
                    gameEnemyPick.setIcon(EnemyPaper);
                }
                else if (isScissorsChoosed == true)
                {
                    gameEnemyPick.setIcon(EnemyRock);
                }
            }

            if (Objects.equals(result, "draw"))
            {
                if (isPaperChoosed == true)
                {
                    gameEnemyPick.setIcon(EnemyPaper);
                }
                else if (isRockChoosed == true)
                {
                    gameEnemyPick.setIcon(EnemyRock);
                }
                else if (isScissorsChoosed == true)
                {
                    gameEnemyPick.setIcon(EnemyScissors);
                }
            }

            String gameState = in.readLine();

            if (Objects.equals(gameState, "endgame"))
            {
                YourPointsLabel.setText(gameYourPoints.getText());
                EnemyPointsLabel.setText(gameEnemyPoints.getText());
                GameResultPanel.setVisible(true);
                

                clientSocket.close();
                in.close();
                out.close();

                gameYourPoints.setText("");
                gameEnemyPoints.setText("");
                //gameSendButton.setEnabled(true);


                gamePanel.setVisible(false);
                gamePanel.setEnabled(false);

                mainMenuPanel.setVisible(true);
                mainMenuPanel.setEnabled(true);

                return;
            }

            gameSendButton.setEnabled(true);
            gameRockChooser.setEnabled(true);

            gamePaperChooser.setEnabled(true);

            gameScissorsChooser.setEnabled(true);

        }
        catch (IOException e)
        {
            gameSendButton.setText("Error!");
        }


    }//GEN-LAST:event_gameSendButtonActionPerformed

    private void mainMenuStartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuStartButtonActionPerformed

        connectingPanel.setVisible(true);
        connectingPanel.setEnabled(true);

        mainMenuPanel.setVisible(false);
        mainMenuPanel.setEnabled(false);
        mainPanel.updateUI();

        try
        {
            clientSocket = new Socket("localhost", 8080);
            // читать соообщения с сервера
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            // писать туда же
            out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            String str = in.readLine();
            if (Objects.equals(str, "found"))
            {
                connectingPanel.setVisible(false);
                connectingPanel.setEnabled(false);
                gamePanel.setVisible(true);
                gamePanel.setEnabled(true);
            }
            else
            {
                connectingLabel.setText("No one came...");
                mainMenuPanel.setEnabled(true);
                mainMenuPanel.setVisible(true);
                connectingPanel.setVisible(false);
                connectingPanel.setEnabled(false);
            }

        }
        catch (IOException e)
        {
            connectingLabel.setText("Error!");
        }

    }//GEN-LAST:event_mainMenuStartButtonActionPerformed

    private void RulesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RulesButtonActionPerformed
            RulesDialogWindow.setVisible(true);
    }//GEN-LAST:event_RulesButtonActionPerformed

    private void RulesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RulesButtonMouseClicked

    }//GEN-LAST:event_RulesButtonMouseClicked

    private void RulesButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RulesButtonOkActionPerformed
        RulesDialogWindow.setVisible(false);
    }//GEN-LAST:event_RulesButtonOkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GameResultPanelOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameResultPanelOkButtonActionPerformed
        GameResultPanel.setVisible(false);
    }//GEN-LAST:event_GameResultPanelOkButtonActionPerformed
    

    
    public static void main(String args[]) throws IOException
    {
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
            java.util.logging.Logger.getLogger(MainframeClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainframeClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainframeClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainframeClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new MainframeClient().setVisible(true);
            }
        });
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EnemyPointsLabel;
    private javax.swing.JLabel GameOverLabel;
    private javax.swing.JDialog GameResultPanel;
    private javax.swing.JButton GameResultPanelOkButton;
    private javax.swing.JButton RulesButton;
    private javax.swing.JButton RulesButtonOk;
    private javax.swing.JDialog RulesDialogWindow;
    private javax.swing.JLabel ScoreLabel;
    private javax.swing.JLabel YourPointsLabel;
    private javax.swing.JLabel connectingLabel;
    private javax.swing.JPanel connectingPanel;
    private javax.swing.JLabel gameDashLabel;
    private javax.swing.JLabel gameEnemyLabel;
    private javax.swing.JLabel gameEnemyPick;
    private javax.swing.JLabel gameEnemyPoints;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel gamePaperChooser;
    private javax.swing.JLabel gameRockChooser;
    private javax.swing.JLabel gameScissorsChooser;
    private javax.swing.JButton gameSendButton;
    private javax.swing.JLabel gameYouLabel;
    private javax.swing.JLabel gameYourPick;
    private javax.swing.JLabel gameYourPoints;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel mainMenuIcon;
    private javax.swing.JLabel mainMenuLabel;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel mainMenuSignature;
    private javax.swing.JButton mainMenuStartButton;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
