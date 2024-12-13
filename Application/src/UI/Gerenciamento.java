package UI;

import DAO.*;
import DTO.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Gerenciamento extends javax.swing.JFrame {
    public Gerenciamento() {
        initComponents();
        carregarTabelas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        cliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cli_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cli_cpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cli_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cli_numero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cli_rua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cli_bairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cli_cidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cli_estado = new javax.swing.JTextField();
        cli_cadastrar = new javax.swing.JButton();
        cli_atualizar = new javax.swing.JButton();
        cli_remover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cli_table = new javax.swing.JTable();
        cli_carregar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        funcionario = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        fun_nome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fun_ctps = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fun_telefone = new javax.swing.JTextField();
        fun_cadastrar = new javax.swing.JButton();
        fun_atualizar = new javax.swing.JButton();
        fun_REMOVER = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fun_table = new javax.swing.JTable();
        fun_carregar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        especialidade = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        esp_nome = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        esp_descricao = new javax.swing.JTextField();
        esp_cadastrar = new javax.swing.JButton();
        esp_atualizar = new javax.swing.JButton();
        esp_remover = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        esp_table = new javax.swing.JTable();
        esp_carregar = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        dentista = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        den_nome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        den_cro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        den_telefone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        den_especialidade = new javax.swing.JComboBox<>();
        den_cadastrar = new javax.swing.JButton();
        den_atualizar = new javax.swing.JButton();
        den_remover = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        den_table = new javax.swing.JTable();
        den_carregar = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        servico = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ser_descricao = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ser_duracao = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        ser_valor = new javax.swing.JTextField();
        ser_cadastrar = new javax.swing.JButton();
        ser_atualizar = new javax.swing.JButton();
        ser_remover = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        ser_table = new javax.swing.JTable();
        ser_carregar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        atendimento = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        ate_data = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ate_dentista = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        ate_cliente = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        ate_servico = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        ate_funcionario = new javax.swing.JComboBox<>();
        ate_cadastrar = new javax.swing.JButton();
        ate_atualizar = new javax.swing.JButton();
        ate_remover = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        ate_table = new javax.swing.JTable();
        ate_carregar = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        cli_nome.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("CPF");

        cli_cpf.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Email");

        cli_email.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Numero");

        cli_numero.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Rua");

        cli_rua.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Bairro");

        cli_bairro.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Cidade");

        cli_cidade.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Estado");

        cli_estado.setMinimumSize(new java.awt.Dimension(200, 40));

        cli_cadastrar.setText("CADASTRAR");
        cli_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cli_cadastrarActionPerformed(evt);
            }
        });

        cli_atualizar.setText("ATUALIZAR");
        cli_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cli_atualizarActionPerformed(evt);
            }
        });

        cli_remover.setText("REMOVER");
        cli_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cli_removerActionPerformed(evt);
            }
        });

        cli_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nome", "cpf", "email", "numero", "rua", "bairro", "cidade", "estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cli_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cli_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cli_table);

        cli_carregar.setText("CARREGAR");
        cli_carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cli_carregarActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel27.setText("Clique duas vezes no registro para modifica-lo");

        javax.swing.GroupLayout clienteLayout = new javax.swing.GroupLayout(cliente);
        cliente.setLayout(clienteLayout);
        clienteLayout.setHorizontalGroup(
            clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cli_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cli_estado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(cli_cidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cli_bairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cli_rua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cli_numero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cli_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cli_cpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel1))
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clienteLayout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clienteLayout.createSequentialGroup()
                                .addComponent(cli_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cli_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cli_remover)
                                .addGap(18, 18, 18)
                                .addComponent(cli_carregar)
                                .addGap(140, 140, 140))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clienteLayout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))))))
        );
        clienteLayout.setVerticalGroup(
            clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cli_cadastrar)
                    .addComponent(cli_atualizar)
                    .addComponent(cli_remover)
                    .addComponent(cli_carregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addComponent(cli_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cli_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cli_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cli_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cli_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cli_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cli_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cli_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", cliente);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Nome");

        fun_nome.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("CTPS");

        fun_ctps.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Telefone");

        fun_telefone.setMinimumSize(new java.awt.Dimension(200, 40));

        fun_cadastrar.setText("CADASTRAR");
        fun_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fun_cadastrarActionPerformed(evt);
            }
        });

        fun_atualizar.setText("ATUALIZAR");
        fun_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fun_atualizarActionPerformed(evt);
            }
        });

        fun_REMOVER.setText("REMOVER");
        fun_REMOVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fun_REMOVERActionPerformed(evt);
            }
        });

        fun_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "nome", "ctps", "telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        fun_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fun_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(fun_table);

        fun_carregar.setText("CARREGAR");
        fun_carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fun_carregarActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel28.setText("Clique duas vezes no registro para modifica-lo");

        javax.swing.GroupLayout funcionarioLayout = new javax.swing.GroupLayout(funcionario);
        funcionario.setLayout(funcionarioLayout);
        funcionarioLayout.setHorizontalGroup(
            funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fun_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(fun_telefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(fun_ctps, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel13))
                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, funcionarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fun_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fun_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fun_REMOVER)
                        .addGap(18, 18, 18)
                        .addComponent(fun_carregar)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, funcionarioLayout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(funcionarioLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))))
        );
        funcionarioLayout.setVerticalGroup(
            funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcionarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(fun_cadastrar)
                    .addComponent(fun_atualizar)
                    .addComponent(fun_REMOVER)
                    .addComponent(fun_carregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(funcionarioLayout.createSequentialGroup()
                        .addComponent(fun_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fun_ctps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fun_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funcionario", funcionario);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Nome");

        esp_nome.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Descricao");

        esp_descricao.setMinimumSize(new java.awt.Dimension(200, 40));

        esp_cadastrar.setText("CADASTRAR");
        esp_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esp_cadastrarActionPerformed(evt);
            }
        });

        esp_atualizar.setText("ATUALIZAR");
        esp_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esp_atualizarActionPerformed(evt);
            }
        });

        esp_remover.setText("REMOVER");
        esp_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esp_removerActionPerformed(evt);
            }
        });

        esp_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "nome", "descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        esp_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esp_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(esp_table);

        esp_carregar.setText("CARREGAR");
        esp_carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esp_carregarActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel29.setText("Clique duas vezes no registro para modifica-lo");

        javax.swing.GroupLayout especialidadeLayout = new javax.swing.GroupLayout(especialidade);
        especialidade.setLayout(especialidadeLayout);
        especialidadeLayout.setHorizontalGroup(
            especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(especialidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(esp_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(esp_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGroup(especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, especialidadeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(esp_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(esp_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(esp_remover)
                        .addGap(18, 18, 18)
                        .addComponent(esp_carregar)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, especialidadeLayout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(especialidadeLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))))
        );
        especialidadeLayout.setVerticalGroup(
            especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(especialidadeLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(esp_cadastrar)
                    .addComponent(esp_atualizar)
                    .addComponent(esp_remover)
                    .addComponent(esp_carregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(especialidadeLayout.createSequentialGroup()
                        .addComponent(esp_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(esp_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Especialidade", especialidade);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Nome");

        den_nome.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("CRO");

        den_cro.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Telefone");

        den_telefone.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Especialidade");

        den_especialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione --" }));

        den_cadastrar.setText("CADASTRAR");
        den_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                den_cadastrarActionPerformed(evt);
            }
        });

        den_atualizar.setText("ATUALIZAR");
        den_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                den_atualizarActionPerformed(evt);
            }
        });

        den_remover.setText("REMOVER");
        den_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                den_removerActionPerformed(evt);
            }
        });

        den_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "nome", "cro", "telefone", "especialidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        den_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                den_tableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(den_table);

        den_carregar.setText("CARREGAR");
        den_carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                den_carregarActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel30.setText("Clique duas vezes no registro para modifica-lo");

        javax.swing.GroupLayout dentistaLayout = new javax.swing.GroupLayout(dentista);
        dentista.setLayout(dentistaLayout);
        dentistaLayout.setHorizontalGroup(
            dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dentistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(den_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(den_telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(den_cro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel20)
                        .addComponent(den_especialidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dentistaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(den_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(den_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(den_remover)
                        .addGap(18, 18, 18)
                        .addComponent(den_carregar)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dentistaLayout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dentistaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))))
        );
        dentistaLayout.setVerticalGroup(
            dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dentistaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(den_cadastrar)
                    .addComponent(den_atualizar)
                    .addComponent(den_remover)
                    .addComponent(den_carregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dentistaLayout.createSequentialGroup()
                        .addComponent(den_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(den_cro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(den_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(den_especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dentista", dentista);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Descrição");

        ser_descricao.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Duração");

        ser_duracao.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Valor");

        ser_valor.setMinimumSize(new java.awt.Dimension(200, 40));

        ser_cadastrar.setText("CADASTRAR");
        ser_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ser_cadastrarActionPerformed(evt);
            }
        });

        ser_atualizar.setText("ATUALIZAR");
        ser_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ser_atualizarActionPerformed(evt);
            }
        });

        ser_remover.setText("REMOVER");
        ser_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ser_removerActionPerformed(evt);
            }
        });

        ser_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "descrição", "duração", "valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ser_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ser_tableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(ser_table);

        ser_carregar.setText("CARREGAR");
        ser_carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ser_carregarActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel26.setText("Clique duas vezes no registro para modifica-lo");

        javax.swing.GroupLayout servicoLayout = new javax.swing.GroupLayout(servico);
        servico.setLayout(servicoLayout);
        servicoLayout.setHorizontalGroup(
            servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ser_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ser_valor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(ser_duracao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel12))
                .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servicoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ser_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ser_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ser_remover)
                        .addGap(18, 18, 18)
                        .addComponent(ser_carregar)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servicoLayout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(servicoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))))
        );
        servicoLayout.setVerticalGroup(
            servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ser_cadastrar)
                    .addComponent(ser_atualizar)
                    .addComponent(ser_remover)
                    .addComponent(ser_carregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(servicoLayout.createSequentialGroup()
                        .addComponent(ser_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ser_duracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ser_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Serviço", servico);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Data e hora");

        ate_data.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Dentista");

        ate_dentista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione --" }));
        ate_dentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ate_dentistaActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Cliente");

        ate_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione --" }));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Serviço");

        ate_servico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione --" }));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Funcionario");

        ate_funcionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione --" }));

        ate_cadastrar.setText("CADASTRAR");
        ate_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ate_cadastrarActionPerformed(evt);
            }
        });

        ate_atualizar.setText("ATUALIZAR");
        ate_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ate_atualizarActionPerformed(evt);
            }
        });

        ate_remover.setText("REMOVER");
        ate_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ate_removerActionPerformed(evt);
            }
        });

        ate_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "dentista", "cliente", "serviço", "funcionário", "data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ate_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ate_tableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(ate_table);

        ate_carregar.setText("CARREGAR");
        ate_carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ate_carregarActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel31.setText("Clique duas vezes no registro para modifica-lo");

        javax.swing.GroupLayout atendimentoLayout = new javax.swing.GroupLayout(atendimento);
        atendimento.setLayout(atendimentoLayout);
        atendimentoLayout.setHorizontalGroup(
            atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atendimentoLayout.createSequentialGroup()
                        .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ate_dentista, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ate_data, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(atendimentoLayout.createSequentialGroup()
                        .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(ate_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(ate_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(ate_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)))
                .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atendimentoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(atendimentoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(ate_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ate_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ate_remover)
                        .addGap(18, 18, 18)
                        .addComponent(ate_carregar)))
                .addGap(56, 56, 56))
        );
        atendimentoLayout.setVerticalGroup(
            atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atendimentoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(ate_cadastrar)
                    .addComponent(ate_atualizar)
                    .addComponent(ate_remover)
                    .addComponent(ate_carregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atendimentoLayout.createSequentialGroup()
                        .addComponent(ate_data, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ate_dentista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ate_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ate_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ate_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Atendimento", atendimento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int Cliente_id;
    public int Funcionario_id;
    public int Especialidade_id;
    public int Dentista_id;
    public int Servico_id;
    public int Atendimento_id;
    
    private void carregarTabelas(){
        listaCliente();
        listaFuncionario();
        listaEspecialidade();
        listaDentista();
        listaServico();
        listaAtendimento();
    }
    
    private void listaCliente(){
        try {
            clienteDAO dados = new clienteDAO();
            cli_table.removeAll();
            DefaultTableModel model = (DefaultTableModel)cli_table.getModel();
            model.setNumRows(0);
        
            ArrayList<cliente> lista = dados.CarregaCliente();
            
            for(int num=0;num < lista.size();num++) {
                model.addRow(new Object[]{
                    lista.get(num).getCliente_id(),
                    lista.get(num).getNome(),
                    lista.get(num).getCpf(),
                    lista.get(num).getEmail(),
                    lista.get(num).getNumero(),
                    lista.get(num).getRua(),
                    lista.get(num).getBairro(),
                    lista.get(num).getCidade(),
                    lista.get(num).getEstado()
                
                });
            }
            
            if(model.getRowCount()<= 0){
                JOptionPane.showMessageDialog(null, "Não há registrosde Clientes");
            }
                
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir"+e.getMessage());
        }
    }
    
    private void listaFuncionario(){
        try {
            funcionarioDAO dados = new funcionarioDAO();
            fun_table.removeAll();
            
            DefaultTableModel model = (DefaultTableModel)fun_table.getModel();
            model.setNumRows(0);
        
            ArrayList<funcionario> lista = dados.CarregaFuncionario();
            
            for(int num=0;num < lista.size();num++) {
                model.addRow(new Object[]{
                    lista.get(num).getFuncionario_id(),
                    lista.get(num).getNome(),
                    lista.get(num).getCtps(),
                    lista.get(num).getTelefone(),
                
                });
            }
            
            if(model.getRowCount()<= 0){
                JOptionPane.showMessageDialog(null, "Não há registros de Funcionários");
            }
                
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir"+e.getMessage());
        }
    }
    
    private void listaEspecialidade(){
        try {
            especialidadeDAO dados = new especialidadeDAO();
            esp_table.removeAll();
            DefaultTableModel model = (DefaultTableModel)esp_table.getModel();
            model.setNumRows(0);
        
            ArrayList<especialidade> lista = dados.CarregaEspecialidade();
            
            for(int num=0;num < lista.size();num++) {
                model.addRow(new Object[]{
                    lista.get(num).getEspecialidade_id(),
                    lista.get(num).getNome(),
                    lista.get(num).getDesc(),
                    
                
                });
            }
            
            if(model.getRowCount()<= 0){
                JOptionPane.showMessageDialog(null, "Não há registrosde Especialidades");
            }
                
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir"+e.getMessage());
        }
    }
    
    private void listaDentista(){
        try {
            dentistaDAO dados = new dentistaDAO();
            den_table.removeAll();
            DefaultTableModel model = (DefaultTableModel)den_table.getModel();
            model.setNumRows(0);
        
            ArrayList<dentista> lista = dados.CarregaDentista();
            
            for(int num=0;num < lista.size();num++) {
                model.addRow(new Object[]{            
                    lista.get(num).getDentista_id(),
                    lista.get(num).getNome(),
                    lista.get(num).getCro(),
                    lista.get(num).getTel(),
                    lista.get(num).getEspecialidade_id()
                
                });
            }
            
            if(model.getRowCount()<= 0){
                JOptionPane.showMessageDialog(null, "Não há registros de Dentistas");
            }
                
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir"+e.getMessage());
        }
    }
    
    private void listaServico(){
        try {
            servicoDAO dados = new servicoDAO();
            ser_table.removeAll();
            DefaultTableModel model = (DefaultTableModel)ser_table.getModel();
            model.setNumRows(0);
        
            ArrayList<servico> lista = dados.CarregaServico();
            
            for(int num=0;num < lista.size();num++) {
                model.addRow(new Object[]{
                    lista.get(num).getServico_id(),
                    lista.get(num).getDesc(),
                    lista.get(num).getDuracao(),
                    lista.get(num).getValor()
                    
                
                });
            }
            
            if(model.getRowCount()<= 0){
                JOptionPane.showMessageDialog(null, "Não há registros de Serviços");
            }
                
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir"+e.getMessage());
        }
    }
    
    private void listaAtendimento(){
        try {
            atendimentoDAO dados = new atendimentoDAO();
            ate_table.removeAll();
            DefaultTableModel model = (DefaultTableModel)ate_table.getModel();
            model.setNumRows(0);
        
            ArrayList<atendimento> lista = dados.CarregaAtendimento();
            
            for(int num=0;num < lista.size();num++) {
                model.addRow(new Object[]{
                    lista.get(num).getAtendimento_id(),
                    lista.get(num).getDentista(),
                    lista.get(num).getCliente(),
                    lista.get(num).getServico(),
                    lista.get(num).getFuncionario(),
                    lista.get(num).getData()
                    
                
                });
                
            }
            
            if(model.getRowCount()<= 0){
                JOptionPane.showMessageDialog(null, "Não há registros de Atendimentos");
            }
                
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir"+e.getMessage());
        }
    }
    
    private void ate_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ate_cadastrarActionPerformed

        //JOptionPane.showMessageDialog(null, ate_dentista.getSelectedItem().toString()+"\n\n"+ate_cliente.getSelectedItem()+"\n\n"+ate_servico.getSelectedItem()+"\n\n"+ate_funcionario.getSelectedItem());
        if(ate_dentista.getSelectedItem().equals("Selecione uma opção") || ate_cliente.getSelectedItem().equals("-- Selecione --") || ate_servico.getSelectedItem().equals("-- Selecione --") || ate_funcionario.getSelectedItem().equals("-- Selecione --")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        else {
            atendimento ate = new atendimento();
            atendimentoDAO insert = new atendimentoDAO();

            ate.setDentista(ate_dentista.getSelectedItem().toString());
            ate.setCliente(ate_cliente.getSelectedItem().toString());
            ate.setServico(ate_servico.getSelectedItem().toString());
            ate.setFuncionario(ate_funcionario.getSelectedItem().toString());

            insert.cadastro(ate);
        }
        
        carregaFKs();
        carregarTabelas();
    }//GEN-LAST:event_ate_cadastrarActionPerformed

    private void ate_dentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ate_dentistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ate_dentistaActionPerformed

    private void ser_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ser_cadastrarActionPerformed
        if(ser_descricao.getText().isEmpty() || ser_duracao.getText().isEmpty() || ser_valor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        else {
            servico ser = new servico();
            servicoDAO insert = new servicoDAO();

            ser.setDesc(ser_descricao.getText());
            ser.setDuracao(ser_duracao.getText());
            ser.setValor(Float.parseFloat(ser_valor.getText()));

            insert.cadastro(ser);
        }
        carregaFKs();
        carregarTabelas();
    }//GEN-LAST:event_ser_cadastrarActionPerformed

    private void fun_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fun_cadastrarActionPerformed
        if(fun_nome.getText().isEmpty() || fun_ctps.getText().isEmpty() || fun_telefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        else {
            funcionario fun = new funcionario();
            funcionarioDAO insert = new funcionarioDAO();

            fun.setNome(fun_nome.getText());
            fun.setCtps(fun_ctps.getText());
            fun.setTelefone(fun_telefone.getText());

            insert.cadastro(fun);
            
        }
        carregaFKs();
        carregarTabelas();
    }//GEN-LAST:event_fun_cadastrarActionPerformed

    private void cli_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cli_cadastrarActionPerformed
        
        if(cli_nome.getText().isEmpty() || cli_cpf.getText().isEmpty() || cli_email.getText().isEmpty() || cli_numero.getText().isEmpty() || cli_rua.getText().isEmpty() || cli_bairro.getText().isEmpty() || cli_cidade.getText().isEmpty() || cli_estado.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {
            cliente cli = new cliente();
            clienteDAO insert = new clienteDAO();
            

            cli.setNome(cli_nome.getText());
            cli.setCpf(cli_cpf.getText());
            cli.setEmail(cli_email.getText());
            cli.setNumero(cli_numero.getText());
            cli.setRua(cli_rua.getText());
            cli.setBairro(cli_bairro.getText());
            cli.setCidade(cli_cidade.getText());
            cli.setEstado(cli_estado.getText());

            insert.cadastro(cli);
            
        }
        carregaFKs();
        carregarTabelas();
    }//GEN-LAST:event_cli_cadastrarActionPerformed

    private void cli_carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cli_carregarActionPerformed
        listaCliente();
       
    }//GEN-LAST:event_cli_carregarActionPerformed

    private void fun_carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fun_carregarActionPerformed
        listaFuncionario();
    }//GEN-LAST:event_fun_carregarActionPerformed

    private void esp_carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esp_carregarActionPerformed
        listaEspecialidade();
    }//GEN-LAST:event_esp_carregarActionPerformed

    private void den_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_den_cadastrarActionPerformed
        if(den_nome.getText().isEmpty() || den_cro.getText().isEmpty() || den_especialidade.getSelectedItem().equals("-- Selecione --")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        else {
            dentista den = new dentista();
            dentistaDAO insert = new dentistaDAO();

            den.setEspecialidade_id(den_especialidade.getSelectedItem().toString());
            den.setNome(den_nome.getText());
            den.setCro(den_cro.getText());
            den.setTel(den_telefone.getText());
         
            insert.cadastro(den);
        }
        carregaFKs();
        carregarTabelas();
    }//GEN-LAST:event_den_cadastrarActionPerformed

    private void carregaFKs(){
        carregaDentista_Especialidade();
        carregaAtendimento_Dentista();
        carregaAtendimento_Cliente();
        carregaAtendimento_Servico();
        carregaAtendimento_Funcionario();
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregaFKs();
    }//GEN-LAST:event_formWindowOpened

    private void den_carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_den_carregarActionPerformed
        listaDentista();
    }//GEN-LAST:event_den_carregarActionPerformed

    private void ser_carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ser_carregarActionPerformed
        
        listaServico();
    }//GEN-LAST:event_ser_carregarActionPerformed

    private void ate_carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ate_carregarActionPerformed
        listaAtendimento();
    }//GEN-LAST:event_ate_carregarActionPerformed

    private void ate_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ate_removerActionPerformed
        
        atendimentoDAO obj = new atendimentoDAO();
        DefaultTableModel model = (DefaultTableModel)ate_table.getModel();
        int[] nSelected = ate_table.getSelectedRows();
        
        if(nSelected.length!=0){
            int[] nCodigos = new int [nSelected.length];
            for(int i = 0; i<nSelected.length;i++){
                nCodigos[i] = Integer.parseInt(model.getValueAt(nSelected[i], 0).toString());
            }
            obj.RemoverRegistros(nCodigos);
        }else
            JOptionPane.showMessageDialog(null, "Selecione um registro primeiro");
        
        listaAtendimento();
        carregaFKs();
    }//GEN-LAST:event_ate_removerActionPerformed

    private void cli_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cli_removerActionPerformed
        clienteDAO obj = new clienteDAO();
        DefaultTableModel model = (DefaultTableModel)cli_table.getModel();
        int[] nSelected = cli_table.getSelectedRows();
        
        if(nSelected.length!=0){
            int[] nCodigos = new int [nSelected.length];
            for(int i = 0; i<nSelected.length;i++){
                
                nCodigos[i] = Integer.parseInt(model.getValueAt(nSelected[i], 0).toString());
            }
            obj.RemoverRegistros(nCodigos);
        }else
            JOptionPane.showMessageDialog(null, "Selecione um registro primeiro");
        
        cli_carregarActionPerformed(evt);
        carregaFKs();
    }//GEN-LAST:event_cli_removerActionPerformed

    private void cli_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cli_atualizarActionPerformed
        cliente cli = new cliente();
        clienteDAO dados = new clienteDAO();
        
        cli.setCliente_id(Cliente_id);
        cli.setNome(cli_nome.getText());
        cli.setCpf(cli_cpf.getText());
        cli.setEmail(cli_email.getText());
        cli.setNumero(cli_numero.getText());
        cli.setRua(cli_rua.getText());
        cli.setBairro(cli_bairro.getText());
        cli.setCidade(cli_cidade.getText());
        cli.setEstado(cli_estado.getText());
        
        dados.atualizaDados(cli);
        
        listaCliente();
        carregaFKs();
    }//GEN-LAST:event_cli_atualizarActionPerformed

    private void fun_REMOVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fun_REMOVERActionPerformed
        funcionarioDAO obj = new funcionarioDAO();
        DefaultTableModel model = (DefaultTableModel)fun_table.getModel();
        int[] nSelected = fun_table.getSelectedRows();
        
        if(nSelected.length!=0){
            int[] nCodigos = new int [nSelected.length];
            for(int i = 0; i<nSelected.length;i++){
                
                nCodigos[i] = Integer.parseInt(model.getValueAt(nSelected[i], 0).toString());
            }
            obj.RemoverRegistros(nCodigos);
        }else
            JOptionPane.showMessageDialog(null, "Selecione um registro primeiro");  
        
        listaFuncionario();
        carregaFKs();
        
    }//GEN-LAST:event_fun_REMOVERActionPerformed

    private void esp_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esp_removerActionPerformed
        especialidadeDAO obj = new especialidadeDAO();
        DefaultTableModel model = (DefaultTableModel)esp_table.getModel();
        int[] nSelected = esp_table.getSelectedRows();
        
        if(nSelected.length!=0){
            int[] nCodigos = new int [nSelected.length];
            for(int i = 0; i<nSelected.length;i++){
                nCodigos[i] = Integer.parseInt(model.getValueAt(nSelected[i], 0).toString());
            }
            obj.RemoverRegistros(nCodigos);
        }else
            JOptionPane.showMessageDialog(null, "Selecione um registro primeiro");
        
        listaEspecialidade();
        carregaFKs();
    }//GEN-LAST:event_esp_removerActionPerformed

    private void den_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_den_removerActionPerformed
        dentistaDAO obj = new dentistaDAO();
        DefaultTableModel model = (DefaultTableModel)den_table.getModel();
        int[] nSelected = den_table.getSelectedRows();
        
        if(nSelected.length!=0){
            int[] nCodigos = new int [nSelected.length];
            for(int i = 0; i<nSelected.length;i++){
                nCodigos[i] = Integer.parseInt(model.getValueAt(nSelected[i], 0).toString());
            }
            obj.RemoverRegistros(nCodigos);
        }else
            JOptionPane.showMessageDialog(null, "Selecione um registro primeiro");
        
        listaDentista();
        carregaFKs();
    }//GEN-LAST:event_den_removerActionPerformed

    private void ser_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ser_removerActionPerformed
        servicoDAO obj = new servicoDAO();
        DefaultTableModel model = (DefaultTableModel)ser_table.getModel();
        int[] nSelected = ser_table.getSelectedRows();
        
        if(nSelected.length!=0){
            int[] nCodigos = new int [nSelected.length];
            for(int i = 0; i<nSelected.length;i++){
                nCodigos[i] = Integer.parseInt(model.getValueAt(nSelected[i], 0).toString());
            }
            obj.RemoverRegistros(nCodigos);
        }else
            JOptionPane.showMessageDialog(null, "Selecione um registro primeiro");
        
        listaServico();
        carregaFKs();
    }//GEN-LAST:event_ser_removerActionPerformed

    private void cli_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cli_tableMouseClicked
        int oReg = cli_table.getSelectedRow();
        if(oReg != -1)
        {
            
            JOptionPane.showMessageDialog(null, "Registro:"+ cli_table.getSelectedRow() +"\n ID:"+ cli_table.getValueAt(oReg, 0));
            Cliente_id = Integer.parseInt(cli_table.getValueAt(oReg, 0).toString());
            cli_nome.setText(cli_table.getValueAt( cli_table.getSelectedRow(), 1).toString());
            cli_cpf.setText(cli_table.getValueAt( cli_table.getSelectedRow(), 2).toString());
            cli_email.setText(cli_table.getValueAt( cli_table.getSelectedRow(), 3).toString());
            cli_numero.setText(cli_table.getValueAt( cli_table.getSelectedRow(), 4).toString());
            cli_rua.setText(cli_table.getValueAt( cli_table.getSelectedRow(), 5).toString());
            cli_bairro.setText(cli_table.getValueAt( cli_table.getSelectedRow(), 6).toString());
            cli_cidade.setText(cli_table.getValueAt( cli_table.getSelectedRow(), 8).toString());
            cli_estado.setText(cli_table.getValueAt( cli_table.getSelectedRow(), 7).toString());
            
        }
    }//GEN-LAST:event_cli_tableMouseClicked

    private void fun_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fun_atualizarActionPerformed
        funcionario fun = new funcionario();
        funcionarioDAO dados = new funcionarioDAO();
        
        fun.setFuncionario_id(Funcionario_id);
        fun.setNome(fun_nome.getText());
        fun.setCtps(fun_ctps.getText());
        fun.setTelefone(fun_telefone.getText());
        
        dados.atualizaDados(fun);
        
        listaFuncionario();
        
        carregaFKs();
    }//GEN-LAST:event_fun_atualizarActionPerformed

    private void esp_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esp_atualizarActionPerformed
        especialidade esp = new especialidade();
        especialidadeDAO dados = new especialidadeDAO();
        
        esp.setEspecialidade_id(Especialidade_id);
        esp.setNome(esp_nome.getText());
        esp.setDesc(esp_descricao.getText());
        
        dados.atualizaDados(esp);
        
        listaEspecialidade();
        
        carregaFKs();
    }//GEN-LAST:event_esp_atualizarActionPerformed

    private void fun_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fun_tableMouseClicked
        int oReg = fun_table.getSelectedRow();
        if(oReg != -1)
        {
            
            JOptionPane.showMessageDialog(null, "Registro:"+ cli_table.getSelectedRow() +"\n ID:"+ cli_table.getValueAt(oReg, 0));
            Funcionario_id = Integer.parseInt(cli_table.getValueAt(oReg, 0).toString());
            fun_nome.setText(fun_table.getValueAt( oReg, 1).toString());
            fun_ctps.setText(fun_table.getValueAt( oReg, 2).toString());
            fun_telefone.setText(fun_table.getValueAt( oReg, 3).toString());
            
        }
    }//GEN-LAST:event_fun_tableMouseClicked

    private void esp_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esp_tableMouseClicked
        int oReg = esp_table.getSelectedRow();
        if(oReg != -1)
        {
            
            JOptionPane.showMessageDialog(null, "Registro:"+ esp_table.getSelectedRow() +"\n ID:"+ esp_table.getValueAt(oReg, 0));
            Especialidade_id = Integer.parseInt(esp_table.getValueAt(oReg, 0).toString());
            esp_nome.setText(esp_table.getValueAt( oReg, 1).toString());
            esp_descricao.setText(esp_table.getValueAt( oReg, 2).toString());   
        }
    }//GEN-LAST:event_esp_tableMouseClicked

    private void den_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_den_tableMouseClicked
        int oReg = den_table.getSelectedRow();
        if(oReg != -1)
        {
            
            JOptionPane.showMessageDialog(null, "Registro:"+ den_table.getSelectedRow() +"\n ID:"+ den_table.getValueAt(oReg, 0));
            Dentista_id = Integer.parseInt(den_table.getValueAt(oReg, 0).toString());
            den_nome.setText(den_table.getValueAt( oReg, 1).toString());
            den_cro.setText(den_table.getValueAt( oReg, 2).toString());   
            den_telefone.setText(den_table.getValueAt( oReg, 3).toString());  
            
            //Connection con = new ConexaoDAO().conectaBD();
            
            ArrayList<Object> oRegs = new ArrayList<Object>();
            
            for(int i=0; i < den_especialidade.getItemCount(); i++){
                oRegs.add(den_especialidade.getItemAt(i));
            }
            
            den_especialidade.setSelectedIndex(oRegs.indexOf(den_table.getValueAt((oReg), 4)));
            
            /*try{
                String sql = "SELECT especialidade_id FROM dentista WHERE dentista_id = ?";
                PreparedStatement pstm = con.prepareStatement(sql);
                
                pstm.setInt(1, Dentista_id);
                ResultSet rs = pstm.executeQuery();
                rs.next();
                den_especialidade.setSelectedIndex(rs.getInt("especialidade_id"));
            }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "ERRO: "+ e.getMessage());
            }*/
            //JOptionPane.showMessageDialog(null, den_especialidade.getModel().ge);
        }
    }//GEN-LAST:event_den_tableMouseClicked

    private void ser_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ser_atualizarActionPerformed
        servico ser = new servico();
        servicoDAO dados = new servicoDAO();
        
        ser.setServico_id(Servico_id);
        ser.setDesc(ser_descricao.getText());
	ser.setDuracao(ser_duracao.getText());
        ser.setValor(Integer.parseInt(ser_valor.getText()));
		
        dados.atualizaDados(ser);
        
        listaServico();
        
        carregaFKs();
    }//GEN-LAST:event_ser_atualizarActionPerformed

    private void ate_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ate_atualizarActionPerformed
        atendimento ate = new atendimento();
        atendimentoDAO dados = new atendimentoDAO();

        ate.setAtendimento_id(Atendimento_id);
        ate.setDentista(ate_dentista.getSelectedItem().toString());
        ate.setCliente(ate_cliente.getSelectedItem().toString());
        ate.setServico(ate_servico.getSelectedItem().toString());
        ate.setFuncionario(ate_funcionario.getSelectedItem().toString());
        
        dados.atualizaDados(ate);

        listaAtendimento();
        
        carregaFKs();
    }//GEN-LAST:event_ate_atualizarActionPerformed

    private void ate_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ate_tableMouseClicked
        int oReg = ate_table.getSelectedRow();
        if(oReg != -1)
        {
            
            JOptionPane.showMessageDialog(null, "Registro:"+ ate_table.getSelectedRow() +"\n ID:"+ ate_table.getValueAt(oReg, 0));
            Atendimento_id = Integer.parseInt(ate_table.getValueAt(oReg, 0).toString());
            ate_data.setText(ate_table.getValueAt( oReg, 5).toString());
                    
            //Connection con = new ConexaoDAO().conectaBD();
            
            
            /*try{
                String sql = "SELECT dentista_id den, cliente_id cli, servico_id ser, funcionario_id fun FROM atendimento WHERE atendimento_id = ?";
                PreparedStatement pstm = con.prepareStatement(sql);
                
                pstm.setInt(1, Atendimento_id);
                ResultSet rs = pstm.executeQuery();
                rs.next();
                ate_dentista.setSelectedIndex(rs.getInt("den"));
                ate_cliente.setSelectedIndex(rs.getInt("cli"));
                ate_servico.setSelectedIndex(rs.getInt("ser"));
                ate_funcionario.setSelectedIndex(rs.getInt("fun"));
            }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "ERRO: "+ e.getMessage());
            }*/
            
            ArrayList<Object> oRegs = new ArrayList<Object>();
            int i;
            for(i=0; i < ate_dentista.getItemCount(); i++){
                oRegs.add(ate_dentista.getItemAt(i));
            }
            ate_dentista.setSelectedIndex(oRegs.indexOf(ate_table.getValueAt(oReg, 1)));
            oRegs.clear();
            for(i=0; i < ate_cliente.getItemCount(); i++){
                oRegs.add(ate_cliente.getItemAt(i));
            }
            ate_cliente.setSelectedIndex(oRegs.indexOf(ate_table.getValueAt(oReg, 2)));
            oRegs.clear();
            for(i=0; i < ate_servico.getItemCount(); i++){
                oRegs.add(ate_servico.getItemAt(i));
            }
            ate_servico.setSelectedIndex(oRegs.indexOf(ate_table.getValueAt(oReg, 3)));
            oRegs.clear();
            for(i=0; i < ate_funcionario.getItemCount(); i++){
                oRegs.add(ate_funcionario.getItemAt(i));
            }
            ate_funcionario.setSelectedIndex(oRegs.indexOf(ate_table.getValueAt(oReg, 4)));
            oRegs.clear();
        }
    }//GEN-LAST:event_ate_tableMouseClicked

    private void ser_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ser_tableMouseClicked
        int oReg = ser_table.getSelectedRow();
        if(oReg != -1)
        {
            
            JOptionPane.showMessageDialog(null, "Registro:"+ ser_table.getSelectedRow() +"\n ID:"+ ser_table.getValueAt(oReg, 0));
            Servico_id = Integer.parseInt(ser_table.getValueAt(oReg, 0).toString());
            ser_descricao.setText(ser_table.getValueAt( oReg, 1).toString());   
            ser_duracao.setText(ser_table.getValueAt( oReg, 2).toString());
            ser_valor.setText(ser_table.getValueAt( oReg, 3).toString());
        }
    }//GEN-LAST:event_ser_tableMouseClicked

    private void den_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_den_atualizarActionPerformed
        dentista den = new dentista();
        dentistaDAO dados = new dentistaDAO();
        
        den.setDentista_id(Dentista_id);
        den.setNome(den_nome.getText());
        den.setCro(den_cro.getText());
        den.setTel(den_telefone.getText());
        den.setEspecialidade_id(den_especialidade.getSelectedItem().toString());
        
        dados.atualizaDados(den);
        
        listaDentista();
        
        carregaFKs();
    }//GEN-LAST:event_den_atualizarActionPerformed

    private void esp_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esp_cadastrarActionPerformed
        if(esp_nome.getText().isEmpty() || esp_descricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        else {
            especialidade esp = new especialidade();
            especialidadeDAO insert = new especialidadeDAO();
            
            esp.setNome(esp_nome.getText());
            esp.setDesc(esp_descricao.getText());
         
            insert.cadastro(esp);
        }
        carregaFKs();
        carregarTabelas();
    }//GEN-LAST:event_esp_cadastrarActionPerformed

    
    private void carregaDentista_Especialidade(){
    
        Connection con = new ConexaoDAO().conectaBD();
        
        String sql = "SELECT nome FROM especialidade WHERE ativo = 1";
        ArrayList<String> lista = new ArrayList<>();
        
        try{
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while(rs.next()) {
                lista.add(rs.getString("nome"));
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: "+ e.getMessage());
        }
        den_especialidade.removeAllItems();
        for(int num=0;num<lista.size();num++)
        {
            den_especialidade.addItem(lista.get(num));
        }
        
    }
    
    private void carregaAtendimento_Dentista(){
        Connection con = new ConexaoDAO().conectaBD();
        
        String sql = "SELECT nome FROM dentista WHERE ativo = 1";
        ArrayList<String> lista = new ArrayList<>();
        
        try{
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while(rs.next()) {
                lista.add(rs.getString("nome"));
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: "+ e.getMessage());
        }
        
        ate_dentista.removeAllItems();
        for(int num=0;num<lista.size();num++)
        {
            ate_dentista.addItem(lista.get(num));
        }
    }
    
    public void carregaAtendimento_Cliente() {
    
    Connection con = new ConexaoDAO().conectaBD();
        
        String sql = "SELECT nome FROM cliente WHERE ativo = 1";
        ArrayList<String> lista = new ArrayList<>();
        
        try{
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while(rs.next()) {
                lista.add(rs.getString("nome"));
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: "+ e.getMessage());
        }
        
        ate_cliente.removeAllItems();
        for(int num=0;num<lista.size();num++)
        {
            ate_cliente.addItem(lista.get(num));
        }
        
    }
    
    public void carregaAtendimento_Servico() {
    
    Connection con = new ConexaoDAO().conectaBD();
        
        String sql = "SELECT descricao FROM servico WHERE ativo = 1";
        ArrayList<String> lista = new ArrayList<>();
        
        try{
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while(rs.next()) {
                lista.add(rs.getString("descricao"));
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: "+ e.getMessage());
        }
        
        ate_servico.removeAllItems();
        for(int num=0;num<lista.size();num++)
        {
            ate_servico.addItem(lista.get(num));
        }
        
    
    }
    
    public void carregaAtendimento_Funcionario() {
    
    Connection con = new ConexaoDAO().conectaBD();
        
        String sql = "SELECT nome FROM funcionario WHERE ativo = 1";
        ArrayList<String> lista = new ArrayList<>();
        
        try{
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while(rs.next()) {
                lista.add(rs.getString("nome"));
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO: "+ e.getMessage());
        }
        
        ate_funcionario.removeAllItems();
        for(int num=0;num<lista.size();num++)
        {
            ate_funcionario.addItem(lista.get(num));
        }
        
    
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Gerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerenciamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerenciamento().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ate_atualizar;
    private javax.swing.JButton ate_cadastrar;
    private javax.swing.JButton ate_carregar;
    private javax.swing.JComboBox<String> ate_cliente;
    private javax.swing.JTextField ate_data;
    private javax.swing.JComboBox<String> ate_dentista;
    private javax.swing.JComboBox<String> ate_funcionario;
    private javax.swing.JButton ate_remover;
    private javax.swing.JComboBox<String> ate_servico;
    private javax.swing.JTable ate_table;
    private javax.swing.JPanel atendimento;
    private javax.swing.JButton cli_atualizar;
    private javax.swing.JTextField cli_bairro;
    private javax.swing.JButton cli_cadastrar;
    private javax.swing.JButton cli_carregar;
    private javax.swing.JTextField cli_cidade;
    private javax.swing.JTextField cli_cpf;
    private javax.swing.JTextField cli_email;
    private javax.swing.JTextField cli_estado;
    private javax.swing.JTextField cli_nome;
    private javax.swing.JTextField cli_numero;
    private javax.swing.JButton cli_remover;
    private javax.swing.JTextField cli_rua;
    private javax.swing.JTable cli_table;
    private javax.swing.JPanel cliente;
    private javax.swing.JButton den_atualizar;
    private javax.swing.JButton den_cadastrar;
    private javax.swing.JButton den_carregar;
    private javax.swing.JTextField den_cro;
    private javax.swing.JComboBox<String> den_especialidade;
    private javax.swing.JTextField den_nome;
    private javax.swing.JButton den_remover;
    private javax.swing.JTable den_table;
    private javax.swing.JTextField den_telefone;
    private javax.swing.JPanel dentista;
    private javax.swing.JButton esp_atualizar;
    private javax.swing.JButton esp_cadastrar;
    private javax.swing.JButton esp_carregar;
    private javax.swing.JTextField esp_descricao;
    private javax.swing.JTextField esp_nome;
    private javax.swing.JButton esp_remover;
    private javax.swing.JTable esp_table;
    private javax.swing.JPanel especialidade;
    private javax.swing.JButton fun_REMOVER;
    private javax.swing.JButton fun_atualizar;
    private javax.swing.JButton fun_cadastrar;
    private javax.swing.JButton fun_carregar;
    private javax.swing.JTextField fun_ctps;
    private javax.swing.JTextField fun_nome;
    private javax.swing.JTable fun_table;
    private javax.swing.JTextField fun_telefone;
    private javax.swing.JPanel funcionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton ser_atualizar;
    private javax.swing.JButton ser_cadastrar;
    private javax.swing.JButton ser_carregar;
    private javax.swing.JTextField ser_descricao;
    private javax.swing.JTextField ser_duracao;
    private javax.swing.JButton ser_remover;
    private javax.swing.JTable ser_table;
    private javax.swing.JTextField ser_valor;
    private javax.swing.JPanel servico;
    // End of variables declaration//GEN-END:variables

    
    
}
