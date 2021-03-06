package gui;

import dtn.Network;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.apache.commons.math.MathException;

/**
 *
 * @author Renegade
 */
public class SimulationFrame extends javax.swing.JFrame {

    //Variables Declaration
    public Network network;

    /** Creates new form NewJFrame */
    public SimulationFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        setTitle("Broadcasting in DTN : Simulation");

        agentDensity = new javax.swing.JTextField();
        agentDensityLabel = new javax.swing.JLabel();
        pTurn = new javax.swing.JTextField();
        pTurnLabel = new javax.swing.JLabel();
        pRot = new javax.swing.JTextField();
        pRotLabel = new javax.swing.JLabel();
        gamma = new javax.swing.JTextField();
        gammaLabel = new javax.swing.JLabel();
        percentageDA = new javax.swing.JTextField();
        percentageDALabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        generateButton = new javax.swing.JButton();
        graphType = new javax.swing.JComboBox();
        simulationPanel = new SimulationPanel(this);
        key = new javax.swing.JLabel();
        keyS = new javax.swing.JLabel();
        keyI = new javax.swing.JLabel();
        keyR = new javax.swing.JLabel();
        colorI = new javax.swing.JTextField();
        colorS = new javax.swing.JTextField();
        colorR = new javax.swing.JTextField();
        velocity = new javax.swing.JTextField();
        length = new javax.swing.JTextField();
        numNodes = new javax.swing.JTextField();
        nLabel = new javax.swing.JLabel();
        lLabel = new javax.swing.JLabel();
        vLabel = new javax.swing.JLabel();
        graphTypeLabel = new javax.swing.JLabel();
        binSize = new javax.swing.JTextField();
        binSizeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agentDensity.setText("0.044");

        agentDensityLabel.setText("Agent Density:");

        pTurn.setText("0.0001");

        pTurnLabel.setText("pTurn:");

        pRot.setText("0");

        pRotLabel.setText("pRot:");

        gamma.setText("60");

        gammaLabel.setText("Gamma:");

        percentageDA.setText("20");

        percentageDALabel.setText("Percentage DA:");

        startButton.setText("Start Simulation");
        startButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    startButtonActionPerformed(evt);
                } catch (MathException ex) {
                    Logger.getLogger(SimulationFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SimulationFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        generateButton.setText("Generate Graph");
        generateButton.setEnabled(false);
        generateButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });


        graphType.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Scatter", "Average"}));
        graphType.setAutoscrolls(true);
        graphType.setEnabled(false);
        graphType.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphTypeActionPerformed(evt);
            }
        });

        graphTypeLabel.setText("Graph Type:");

        binSize.setText("5");
        binSize.setEnabled(false);

        binSizeLabel.setText("Bin Size:");

        simulationPanel.setBackground(new java.awt.Color(255, 255, 255));
        simulationPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        simulationPanel.setPreferredSize(new java.awt.Dimension(550, 550));

        key.setText("Key:");

        keyS.setText("Susceptible Node");

        keyI.setText("Infected Node");

        keyR.setText("Recovering Node");

        colorI.setBackground(new java.awt.Color(255, 0, 0));

        colorS.setBackground(new java.awt.Color(0, 255, 0));

        colorR.setBackground(new java.awt.Color(0, 0, 255));

        velocity.setText("0.1");

        length.setText("100");

        numNodes.setText("140");

        nLabel.setText("Number of Nodes:");

        lLabel.setText("Length:");

        vLabel.setText("Velocity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(simulationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(startButton)
                .addContainerGap(78, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(vLabel)
                                .addComponent(lLabel)
                                .addComponent(nLabel)
                                .addComponent(agentDensityLabel)
                                .addComponent(pTurnLabel)
                                .addComponent(pRotLabel)
                                .addComponent(percentageDALabel)
                                .addComponent(gammaLabel)
                                .addComponent(graphTypeLabel)
                                .addComponent(binSizeLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(gamma, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(percentageDA, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pRot, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pTurn, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(agentDensity, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(numNodes, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(length, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(velocity, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(binSize, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(graphType, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(generateButton)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(key, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(3, 3, 3).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(colorI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(colorS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(colorR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(keyI)
                                .addComponent(keyS)
                                .addComponent(keyR))))))
                                .addContainerGap()))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(simulationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numNodes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(velocity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agentDensity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agentDensityLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pTurn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pTurnLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pRot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pRotLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(percentageDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(percentageDALabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gamma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gammaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(graphType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(graphTypeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(binSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(binSizeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generateButton)
                        .addGap(22, 22, 22)
                        .addComponent(key)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(keyS)
                            .addComponent(colorS, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(keyI)
                            .addComponent(colorI, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(keyR)
                            .addComponent(colorR, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addComponent(startButton)))
                            .addContainerGap()));

        pack();
    }// </editor-fold>

    private void graphTypeActionPerformed(java.awt.event.ActionEvent evt) {

        /* Allows binSize field to be accessed only if graph type is average */
        if(graphType.getSelectedItem().toString().equalsIgnoreCase("Average")) {
            binSize.setEditable(true);
            binSize.setEnabled(true);
        }else{
            binSize.setEditable(false);
            binSize.setEnabled(false);
        }

    }

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) throws MathException, InterruptedException {

        /* Show simulation */
        network = new Network(Integer.parseInt(numNodes.getText()), Integer.parseInt(length.getText()), Double.parseDouble(percentageDA.getText()) / 100, Double.parseDouble(pTurn.getText()), Double.parseDouble(pRot.getText()), Integer.parseInt(gamma.getText()), simulationPanel);
        simulationPanel.setNetwork(network);
        simulationPanel.simulate();
        ((JComponent) SimulationFrame.this.getContentPane()).revalidate();
        simulationPanel.repaint();

    }

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {

        /* Display Graph */
        final GraphPanel graphPanel = new GraphPanel(network, graphType.getSelectedItem().toString(), Integer.parseInt(binSize.getText()));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame graphFrame = new JFrame();
                graphFrame.setTitle(graphType.getSelectedItem() + " Graph - Routning Time vs Initial Distance");
                graphFrame.add(graphPanel);
                graphFrame.setSize(600, 600);
                graphFrame.setVisible(true);
            }
        });

    }

    JButton getStartButton() {
        return startButton;
    }

    JButton getGenerateButton() {
        return generateButton;
    }

    JTextField getNumNodes() {
        return numNodes;
    }

    JTextField getLength() {
        return length;
    }

    JTextField getAgentDensity() {
        return agentDensity;
    }

    JTextField getPTurn() {
        return pTurn;
    }

    JTextField getPRot() {
        return pRot;
    }

    JTextField getPercentageDA() {
        return percentageDA;
    }

    JTextField getGamma() {
        return gamma;
    }

    JTextField getVelocity() {
        return velocity;
    }

    JTextField getBinSize() {
        return binSize;
    }

    JComboBox getGraphType() {
        return graphType;
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField agentDensity;
    private javax.swing.JLabel agentDensityLabel;
    private javax.swing.JTextField colorI;
    private javax.swing.JTextField colorR;
    private javax.swing.JTextField colorS;
    private javax.swing.JTextField gamma;
    private javax.swing.JLabel gammaLabel;
    private javax.swing.JLabel key;
    private javax.swing.JLabel keyI;
    private javax.swing.JLabel keyR;
    private javax.swing.JLabel keyS;
    private javax.swing.JLabel lLabel;
    private javax.swing.JTextField length;
    private javax.swing.JLabel nLabel;
    private javax.swing.JTextField numNodes;
    private javax.swing.JTextField pRot;
    private javax.swing.JLabel pRotLabel;
    private javax.swing.JTextField pTurn;
    private javax.swing.JLabel pTurnLabel;
    private javax.swing.JTextField percentageDA;
    private javax.swing.JLabel percentageDALabel;
    public SimulationPanel simulationPanel;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel vLabel;
    private javax.swing.JTextField velocity;
    private javax.swing.JButton generateButton;
    private javax.swing.JComboBox graphType;
    private javax.swing.JTextField binSize;
    private javax.swing.JLabel binSizeLabel;
    private javax.swing.JLabel graphTypeLabel;
    // End of variables declaration
}
