package simpleCalculator;

public class java_calculator extends javax.swing.JFrame {

	    double num, ans;
	    int calculation;
	    
	    public java_calculator() {
	        initComponents();
	    
	        jRadioButton1.setEnabled(false); //on button disable
	    }
	    
	    public void arithmeticOperation() {
	        switch(calculation) {
	            case 1: // Addition
	                ans = num + Double.parseDouble(jTextField1.getText());
	                jTextField1.setText(Double.toString(ans));
	                break;
	                
	            case 2: // Subtraction
	                ans = num - Double.parseDouble(jTextField1.getText());
	                jTextField1.setText(Double.toString(ans));
	                break;
	                
	            case 3: // Multiplication
	                ans = num * Double.parseDouble(jTextField1.getText());
	                jTextField1.setText(Double.toString(ans));
	                break;
	                
	            case 4: // Division
	                ans = num / Double.parseDouble(jTextField1.getText());
	                jTextField1.setText(Double.toString(ans));
	                break;
	        }
	    }
	    
	    public void enable() {
	        jTextField1.setEnabled(true);
	        
	        jRadioButton1.setEnabled(false);
	        jRadioButton2.setEnabled(true);
	        
	        jButton1.setEnabled(true);
	        jButton3.setEnabled(true);
	        jButton4.setEnabled(true);
	        jButton5.setEnabled(true);
	        jButton6.setEnabled(true);
	        jButton7.setEnabled(true);
	        jButton8.setEnabled(true);
	        jButton9.setEnabled(true);
	        jButton10.setEnabled(true);
	        jButton11.setEnabled(true);
	        jButton12.setEnabled(true);
	        jButton13.setEnabled(true);
	        jButton14.setEnabled(true);
	        jButton15.setEnabled(true);
	        jButton16.setEnabled(true);
	        jButton17.setEnabled(true);
	        jButton18.setEnabled(true);
	        jButton19.setEnabled(true);
	        jButton20.setEnabled(true);
	    }
	    
	    public void disable() {
	        jTextField1.setEnabled(false);
	        
	        jRadioButton1.setEnabled(true);
	        jRadioButton2.setEnabled(false);
	        
	        jButton1.setEnabled(false);
	        jButton3.setEnabled(false);
	        jButton4.setEnabled(false);
	        jButton5.setEnabled(false);
	        jButton6.setEnabled(false);
	        jButton7.setEnabled(false);
	        jButton8.setEnabled(false);
	        jButton9.setEnabled(false);
	        jButton10.setEnabled(false);
	        jButton11.setEnabled(false);
	        jButton12.setEnabled(false);
	        jButton13.setEnabled(false);
	        jButton14.setEnabled(false);
	        jButton15.setEnabled(false);
	        jButton16.setEnabled(false);
	        jButton17.setEnabled(false);
	        jButton18.setEnabled(false);
	        jButton19.setEnabled(false);
	        jButton20.setEnabled(false);
	        
	    }
	    
	    private void initComponents() {

	        buttonGroup1 = new javax.swing.ButtonGroup();
	        jButton4 = new javax.swing.JButton();
	        jTextField1 = new javax.swing.JTextField();
	        jRadioButton1 = new javax.swing.JRadioButton();
	        jRadioButton2 = new javax.swing.JRadioButton();
	        jButton1 = new javax.swing.JButton();
	        jButton3 = new javax.swing.JButton();
	        jButton5 = new javax.swing.JButton();
	        jButton6 = new javax.swing.JButton();
	        jButton7 = new javax.swing.JButton();
	        jButton8 = new javax.swing.JButton();
	        jButton9 = new javax.swing.JButton();
	        jButton10 = new javax.swing.JButton();
	        jButton11 = new javax.swing.JButton();
	        jButton12 = new javax.swing.JButton();
	        jButton13 = new javax.swing.JButton();
	        jButton14 = new javax.swing.JButton();
	        jButton15 = new javax.swing.JButton();
	        jButton16 = new javax.swing.JButton();
	        jButton18 = new javax.swing.JButton();
	        jButton19 = new javax.swing.JButton();
	        jButton20 = new javax.swing.JButton();
	        jButton17 = new javax.swing.JButton();
	        jLabel2 = new javax.swing.JLabel();

	        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton4.setText("1");
	        jButton4.setMaximumSize(new java.awt.Dimension(39, 39));

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("4Func_Calc by Amy Ru");
	        setLocation(new java.awt.Point(500, 250));
	        setType(java.awt.Window.Type.UTILITY);

	        jTextField1.setEditable(false);
	        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 23));
	        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

	        buttonGroup1.add(jRadioButton1);
	        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jRadioButton1.setText("ON");
	        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jRadioButton1ActionPerformed(evt);
	            }
	        });

	        buttonGroup1.add(jRadioButton2);
	        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jRadioButton2.setText("OFF");
	        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jRadioButton2ActionPerformed(evt);
	            }
	        });

	        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton1.setText("<--");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton3.setText("+");
	        jButton3.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton3ActionPerformed(evt);
	            }
	        });

	        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton5.setText("C");
	        jButton5.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton5.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton5ActionPerformed(evt);
	            }
	        });

	        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton6.setText("-");
	        jButton6.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton6.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton6ActionPerformed(evt);
	            }
	        });

	        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton7.setText("9");
	        jButton7.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton7.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton7ActionPerformed(evt);
	            }
	        });

	        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton8.setText("8");
	        jButton8.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton8.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton8ActionPerformed(evt);
	            }
	        });

	        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton9.setText("*");
	        jButton9.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton9.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton9ActionPerformed(evt);
	            }
	        });

	        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton10.setText("6");
	        jButton10.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton10.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton10ActionPerformed(evt);
	            }
	        });

	        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton11.setText("5");
	        jButton11.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton11.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton11ActionPerformed(evt);
	            }
	        });

	        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton12.setText("4");
	        jButton12.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton12.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton12ActionPerformed(evt);
	            }
	        });

	        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton13.setText("/");
	        jButton13.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton13.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton13ActionPerformed(evt);
	            }
	        });

	        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); 
	        jButton14.setText("3");
	        jButton14.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton14.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton14ActionPerformed(evt);
	            }
	        });

	        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); 
	        jButton15.setText("2");
	        jButton15.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton15.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton15ActionPerformed(evt);
	            }
	        });

	        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); 
	        jButton16.setText("1");
	        jButton16.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton16.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton16ActionPerformed(evt);
	            }
	        });

	        jButton18.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton18.setText("=");
	        jButton18.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton18.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton18ActionPerformed(evt);
	            }
	        });

	        jButton19.setFont(new java.awt.Font("Tahoma", 1, 12));
	        jButton19.setText(".");
	        jButton19.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton19.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton19ActionPerformed(evt);
	            }
	        });

	        jButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); 
	        jButton20.setText("0");
	        jButton20.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton20.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton20ActionPerformed(evt);
	            }
	        });

	        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); 
	        jButton17.setText("7");
	        jButton17.setMaximumSize(new java.awt.Dimension(39, 39));
	        jButton17.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton17ActionPerformed(evt);
	            }
	        });

	        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(layout.createSequentialGroup()
	                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGap(18, 18, 18)
	                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGap(18, 18, 18)
	                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGap(18, 18, 18)
	                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGroup(layout.createSequentialGroup()
	                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGap(18, 18, 18)
	                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGap(18, 18, 18)
	                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGap(18, 18, 18)
	                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                .addGroup(layout.createSequentialGroup()
	                                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGap(18, 18, 18)
	                                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGap(18, 18, 18)
	                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addGap(18, 18, 18)
	                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                            .addGroup(layout.createSequentialGroup()
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jRadioButton1)
	                                    .addComponent(jRadioButton2))
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(18, 18, 18)
	                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(18, 18, 18)
	                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGap(0, 0, Short.MAX_VALUE))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                        .addGap(0, 0, Short.MAX_VALUE)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(18, 18, 18)
	                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(18, 18, 18)
	                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jRadioButton1)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jRadioButton2))
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap())
	        );

	        pack();
	    }

	    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
	        jTextField1.setText("");
	    }//GEN-LAST:event_jButton5ActionPerformed

	    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
	        jTextField1.setText(jTextField1.getText() + "1");
	    }//GEN-LAST:event_jButton16ActionPerformed

	    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
	        jTextField1.setText(jTextField1.getText() + "2");
	    }//GEN-LAST:event_jButton15ActionPerformed

	    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
	        jTextField1.setText(jTextField1.getText() + "3");
	    }//GEN-LAST:event_jButton14ActionPerformed

	    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
	        jTextField1.setText(jTextField1.getText() + "4");
	    }//GEN-LAST:event_jButton12ActionPerformed

	    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
	        jTextField1.setText(jTextField1.getText() + "5");
	    }//GEN-LAST:event_jButton11ActionPerformed

	    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
	        jTextField1.setText(jTextField1.getText() + "6");
	    }//GEN-LAST:event_jButton10ActionPerformed

	    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
	        jTextField1.setText(jTextField1.getText() + "7");
	    }//GEN-LAST:event_jButton17ActionPerformed

	    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
	        jTextField1.setText(jTextField1.getText() + "8");
	    }//GEN-LAST:event_jButton8ActionPerformed

	    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
	        jTextField1.setText(jTextField1.getText() + "9");
	    }//GEN-LAST:event_jButton7ActionPerformed

	    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
	        jTextField1.setText(jTextField1.getText() + "0");
	    }//GEN-LAST:event_jButton20ActionPerformed

	    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
	        num = Double.parseDouble(jTextField1.getText());
	        calculation = 1;
	        jTextField1.setText("");
	        jLabel2.setText(num + "+");
	    }//GEN-LAST:event_jButton3ActionPerformed

	    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
	        num = Double.parseDouble(jTextField1.getText());
	        calculation = 2;
	        jTextField1.setText("");
	        jLabel2.setText(num + "-");
	    }//GEN-LAST:event_jButton6ActionPerformed

	    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
	        num = Double.parseDouble(jTextField1.getText());
	        calculation = 3;
	        jTextField1.setText("");
	        jLabel2.setText(num + "*");
	    }//GEN-LAST:event_jButton9ActionPerformed

	    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
	        num = Double.parseDouble(jTextField1.getText());
	        calculation = 4;
	        jTextField1.setText("");
	        jLabel2.setText(num + "/");
	    }//GEN-LAST:event_jButton13ActionPerformed

	    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
	        jTextField1.setText(jTextField1.getText() + ".");
	    }//GEN-LAST:event_jButton19ActionPerformed

	    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
	        disable();
	    }//GEN-LAST:event_jRadioButton2ActionPerformed

	    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
	        enable();        // TODO add your handling code here:
	    }//GEN-LAST:event_jRadioButton1ActionPerformed

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	        
	        int length = jTextField1.getText().length();
	        int number = jTextField1.getText().length() - 1;
	        String store;
	        if(length > 0) {
	            StringBuilder back = new StringBuilder(jTextField1.getText());
	            back.deleteCharAt(number);
	            store = back.toString();
	            jTextField1.setText(store);
	        
	        }
	    }//GEN-LAST:event_jButton1ActionPerformed

	    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
	        arithmeticOperation();
	        jLabel2.setText("");
	    }//GEN-LAST:event_jButton18ActionPerformed

	  
	    public static void main(String args[]) {
	     
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(java_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(java_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(java_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(java_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        

	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new java_calculator().setVisible(true);
	            }
	        });
	    }

	    	    private javax.swing.ButtonGroup buttonGroup1;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton10;
	    private javax.swing.JButton jButton11;
	    private javax.swing.JButton jButton12;
	    private javax.swing.JButton jButton13;
	    private javax.swing.JButton jButton14;
	    private javax.swing.JButton jButton15;
	    private javax.swing.JButton jButton16;
	    private javax.swing.JButton jButton17;
	    private javax.swing.JButton jButton18;
	    private javax.swing.JButton jButton19;
	    private javax.swing.JButton jButton20;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JButton jButton4;
	    private javax.swing.JButton jButton5;
	    private javax.swing.JButton jButton6;
	    private javax.swing.JButton jButton7;
	    private javax.swing.JButton jButton8;
	    private javax.swing.JButton jButton9;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JRadioButton jRadioButton1;
	    private javax.swing.JRadioButton jRadioButton2;
	    private javax.swing.JTextField jTextField1;
	}

