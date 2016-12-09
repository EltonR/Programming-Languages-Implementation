package dsl;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Painel extends javax.swing.JFrame {

    public Painel() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("T6 - Elton Rasch, Lorenzo Feldens");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Insira o código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Exemplos:");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Declaração:\nx Numerisch;\n\nAtribuição:\nx <- 3;\nx <- y;\n\n--Operadores Matemáticos:\n + = Summe\n - = Subtraktion\n x = Multiplikation\n / = Aufteilung\n\nOp. Matemática:\nx Summe y;\n3 Subtraktion 2;\n\n--Operadores Comparação:\n == = Gleich\n != = Anders\n  > = Groessrer\n  < = Kleiner\n\nOp. Comparação:\nx Gleich y;\ny Anders 5;\n\nCondição:\nOb --condição-- Anfang --código-- Ende\nOb x Gleich y Anfang x <- 3; Ende\n\nMostrar:\nAnzeigen x;\n");
        jScrollPane2.setViewportView(jTextArea2);

        jButton1.setText("Traduzir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        traduzir();
    }//GEN-LAST:event_jButton1ActionPerformed


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
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Painel().setVisible(true);
            }
        });
    }
    
    private void traduzir(){
    	String[] lines = jTextArea1.getText().split("\n");
        
        String output = "public class GrammatikClass{\n";
        output += "     public static void main(String[] args){\n";
        
        for(int i=0; i<lines.length; i++){
            ANTLRInputStream input =  new ANTLRInputStream(lines[i]);
            GrammatikLexer lexer = new GrammatikLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GrammatikParser parser = new GrammatikParser(tokens);
            
            int tipo = tipoExp(lines[i]);
            output+=getLine(parser,tipo,2, null);
            
        }
        output+="\n     }\n}";
        
        System.out.println("OUTPUT:\n"+output);
	Resultado r = new Resultado(output);
        r.setVisible(true);
        //IMPRIMIR ESSE OUTPUT EM UM DIALOG
    }
    
    private String getIndentacao(int n){
        String ret = "";
        for(int i=0; i<n; i++){
            ret += "     ";
        }
        return ret;
    }
    
    private String getLine(GrammatikParser parser, int tipo, int ind, ParseTree t){
            ParseTree tree = null;
            
            boolean erro = false;
            
            if(parser.getNumberOfSyntaxErrors() > 0){
                erro = true;
            }
            
            switch(tipo){
                case 1:
                    tree = parser.exp_mostra();
                    
                    if(t != null)
                        tree = t;
                    
                    if(erro)
                        return getIndentacao(ind)+"//Erro na Sintaxe da Linha: "+tree.getText();
                    
                    String str = tree.toStringTree(parser);
                    String[] s = str.split(" ");
                    
                    String v = s[s.length-2];
                    
                    
                    return getIndentacao(ind)+"System.out.println("+v.trim()+");";
                case 2:
                    if(erro)
                        return getIndentacao(ind)+"//Erro na Sintaxe da Linha: "+tree.getText();
                    
                    tree = parser.exp_se();
                    
                    if(t != null)
                        tree = t;
                    
                    ParseTree cond = tree.getChild(2);
                    ParseTree atr = tree.getChild(6);
                    
                    String ret = getIndentacao(ind)+"if(";
                    ret += getLine(parser, tipoExp(cond.getText()),0,cond);
                    ret += "){\n    ";
                    ret += getLine(parser, tipoExp(atr.getText()),ind+1,atr);
                    ret += getIndentacao(ind)+"}";
                    
                    return ret;
                case 3:
                    if(erro)
                        return getIndentacao(ind)+"//Erro na Sintaxe da Linha: "+tree.getText();
                    
                    tree = parser.exp_atribuicao();
                    if(t != null)
                        tree = t;
                    
                    String str2 = tree.getText();
                    String[] s2 = str2.split(" ");
                    
                    return getIndentacao(ind)+s2[0].trim()+" = "+s2[2].trim()+"\n";
                case 4:
                    if(erro)
                        return getIndentacao(ind)+"//Erro na Sintaxe da Linha: "+tree.getText();
                    
                    tree = parser.dec_variavel();
                    if(t != null)
                        tree = t;
                    
                    String str3 = tree.getText();
                    String[] s3 = str3.split(" ");
                    
                    return getIndentacao(ind)+"double "+s3[0].trim()+";\n";
                case 5:
                    if(erro)
                        return getIndentacao(ind)+"//Erro na Sintaxe da Linha: "+tree.getText();
                    
                    tree = parser.exp_matematica();
                    if(t != null)
                        tree = t;
                    
                    String str4 = tree.getText();
                    String[] s4 = str4.split(" ");
                    
                    switch(s4[1]){
                        case "Summe":
                            return getIndentacao(ind)+s4[0].trim()+" + "+s4[2].trim()+"\n";
                        case "Subtraktion":
                            return getIndentacao(ind)+s4[0].trim()+" - "+s4[2].trim()+"\n";    
                        case "Multiplikation":
                            return getIndentacao(ind)+s4[0].trim()+" * "+s4[2].trim()+"\n";    
                        case "Aufteilung":
                            return getIndentacao(ind)+s4[0].trim()+" / "+s4[2].trim()+"\n";
                    }
                    
                    break;
                case 6:
                    if(erro)
                        return getIndentacao(ind)+"//Erro na Sintaxe da Linha: "+tree.getText();
                    
                    tree = parser.exp_condicional();
                    
                    if(t != null)
                        tree = t;
                    
                    String str5 = tree.getText();
                    
                    String[] s5 = str5.split(" ");
                    
                    switch(s5[1]){
                        case "Gleich":
                            return getIndentacao(ind)+s5[0].trim()+" == "+s5[2].trim();
                        case "Anders":
                            return getIndentacao(ind)+s5[0].trim()+" != "+s5[2].trim();    
                        case "Groessrer":
                            return getIndentacao(ind)+s5[0].trim()+" > "+s5[2].trim();    
                        case "Kleiner":
                            return getIndentacao(ind)+s5[0].trim()+" < "+s5[2].trim();
                    }
                case 0:
                    return "\n";
            }
            
            return "";
    }
    
    private int tipoExp(String str){
        if(str.contains("Anzeigen"))
            return 1;
        if(str.contains("Ob "))
            return 2;
        if(str.contains("<-"))
            return 3;
        if(str.contains("Numerisch"))
            return 4;
        if (str.contains("Summe") || str.contains("Subtraktion") 
                || str.contains("Multiplikation") || str.contains("Aufteilung"))
            return 5;
        if (str.contains("Gleich") || str.contains("Anders") 
                || str.contains("Groessrer") || str.contains("Kleiner"))
            return 6;
        if(str.trim().equalsIgnoreCase(""))
            return 0;
        
        return -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
