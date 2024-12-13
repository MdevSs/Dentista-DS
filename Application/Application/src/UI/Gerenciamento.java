package UI;

import DAO.*;
import DTO.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Gerenciamento extends javax.swing.JFrame {
    public Gerenciamento() {
        initComponents();
        listaClientes();
        listaFuncionarios();
        listaEspecialidades();
        listaDentistas();
        listaServicos();
        listaAtendimentos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        cliente = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        cli_id = new javax.swing.JTextField();
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
        cli_fechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cli_table = new javax.swing.JTable();
        funcionario = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        fun_nome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fun_ctps = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fun_tel = new javax.swing.JTextField();
        fun_cadastrar = new javax.swing.JButton();
        fun_atualizar = new javax.swing.JButton();
        fun_fechar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fun_table = new javax.swing.JTable();
        fun_id = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        especialidade = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        esp_id = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        esp_nome = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        esp_desc = new javax.swing.JTextField();
        esp_cadastrar = new javax.swing.JButton();
        esp_atualizar = new javax.swing.JButton();
        esp_fechar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        esp_table = new javax.swing.JTable();
        dentista = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        den_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        den_nome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        den_cro = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        den_tel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        den_esp = new javax.swing.JComboBox<>();
        den_cadastrar = new javax.swing.JButton();
        den_atualizar = new javax.swing.JButton();
        den_fechar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        den_table = new javax.swing.JTable();
        servico = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        ser_id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ser_descricao = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ser_duracao = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        ser_valor = new javax.swing.JTextField();
        ser_cadastrar = new javax.swing.JButton();
        ser_atualizar = new javax.swing.JButton();
        ser_fechar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        ser_table = new javax.swing.JTable();
        atendimento = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        ate_id = new javax.swing.JTextField();
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
        ate_fechar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        ate_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 700));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setText("Id");

        cli_id.setMinimumSize(new java.awt.Dimension(200, 40));

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

        cli_fechar.setText("FECHAR");

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
        jScrollPane1.setViewportView(cli_table);

        javax.swing.GroupLayout clienteLayout = new javax.swing.GroupLayout(cliente);
        cliente.setLayout(clienteLayout);
        clienteLayout.setHorizontalGroup(
            clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cli_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(cli_estado, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(cli_bairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cli_rua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cli_numero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cli_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cli_cpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel1)
                        .addComponent(cli_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cli_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clienteLayout.createSequentialGroup()
                        .addComponent(cli_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cli_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cli_fechar)
                        .addGap(167, 167, 167))))
        );
        clienteLayout.setVerticalGroup(
            clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cli_cadastrar)
                    .addComponent(cli_atualizar)
                    .addComponent(cli_fechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cli_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(cli_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
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

        fun_tel.setMinimumSize(new java.awt.Dimension(200, 40));

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

        fun_fechar.setText("FECHAR");

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
        jScrollPane2.setViewportView(fun_table);

        fun_id.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Id");

        javax.swing.GroupLayout funcionarioLayout = new javax.swing.GroupLayout(funcionario);
        funcionario.setLayout(funcionarioLayout);
        funcionarioLayout.setHorizontalGroup(
            funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(funcionarioLayout.createSequentialGroup()
                        .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fun_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fun_tel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(fun_ctps, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(funcionarioLayout.createSequentialGroup()
                        .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fun_id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)))
                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(funcionarioLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, funcionarioLayout.createSequentialGroup()
                        .addComponent(fun_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fun_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fun_fechar)
                        .addGap(167, 167, 167))))
        );
        funcionarioLayout.setVerticalGroup(
            funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(funcionarioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fun_cadastrar)
                    .addComponent(fun_atualizar)
                    .addComponent(fun_fechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(funcionarioLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fun_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fun_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fun_ctps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fun_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funcionario", funcionario);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Id");

        esp_id.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Nome");

        esp_nome.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Descricao");

        esp_desc.setMinimumSize(new java.awt.Dimension(200, 40));

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

        esp_fechar.setText("FECHAR");

        esp_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "nome", "descricao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(esp_table);

        javax.swing.GroupLayout especialidadeLayout = new javax.swing.GroupLayout(especialidade);
        especialidade.setLayout(especialidadeLayout);
        especialidadeLayout.setHorizontalGroup(
            especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(especialidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(especialidadeLayout.createSequentialGroup()
                        .addGroup(especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(esp_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(esp_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(0, 206, Short.MAX_VALUE))
                    .addGroup(especialidadeLayout.createSequentialGroup()
                        .addGroup(especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(esp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(especialidadeLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, especialidadeLayout.createSequentialGroup()
                        .addComponent(esp_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(esp_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(esp_fechar)
                        .addGap(167, 167, 167))))
        );
        especialidadeLayout.setVerticalGroup(
            especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(especialidadeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esp_cadastrar)
                    .addComponent(esp_atualizar)
                    .addComponent(esp_fechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(especialidadeLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(esp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(esp_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(esp_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Especialidade", especialidade);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Id");

        den_id.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Nome");

        den_nome.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("CRO");

        den_cro.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Telefone");

        den_tel.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Especialidade");

        den_esp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        den_fechar.setText("FECHAR");

        den_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "especialidade", "nome", "cro", "telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(den_table);

        javax.swing.GroupLayout dentistaLayout = new javax.swing.GroupLayout(dentista);
        dentista.setLayout(dentistaLayout);
        dentistaLayout.setHorizontalGroup(
            dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dentistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dentistaLayout.createSequentialGroup()
                        .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(den_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(den_tel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(den_cro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel20)
                                .addComponent(den_esp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 206, Short.MAX_VALUE))
                    .addGroup(dentistaLayout.createSequentialGroup()
                        .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(den_id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dentistaLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dentistaLayout.createSequentialGroup()
                        .addComponent(den_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(den_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(den_fechar)
                        .addGap(167, 167, 167))))
        );
        dentistaLayout.setVerticalGroup(
            dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dentistaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(den_cadastrar)
                    .addComponent(den_atualizar)
                    .addComponent(den_fechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dentistaLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(den_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(den_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(den_cro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(den_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(den_esp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dentista", dentista);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("Id");

        ser_id.setMinimumSize(new java.awt.Dimension(200, 40));

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

        ser_atualizar.setText("ATUALIZAR");
        ser_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ser_atualizarActionPerformed(evt);
            }
        });

        ser_fechar.setText("FECHAR");

        ser_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "descricao", "duracao", "valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(ser_table);

        javax.swing.GroupLayout servicoLayout = new javax.swing.GroupLayout(servico);
        servico.setLayout(servicoLayout);
        servicoLayout.setHorizontalGroup(
            servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(servicoLayout.createSequentialGroup()
                        .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ser_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ser_valor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(ser_duracao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(servicoLayout.createSequentialGroup()
                        .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ser_id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)))
                .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(servicoLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servicoLayout.createSequentialGroup()
                        .addComponent(ser_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ser_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ser_fechar)
                        .addGap(167, 167, 167))))
        );
        servicoLayout.setVerticalGroup(
            servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ser_cadastrar)
                    .addComponent(ser_atualizar)
                    .addComponent(ser_fechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(servicoLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ser_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ser_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ser_duracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ser_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Serviço", servico);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Id");

        ate_id.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Data");

        ate_data.setMinimumSize(new java.awt.Dimension(200, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Dentista");

        ate_dentista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Cliente");

        ate_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Serviço");

        ate_servico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Funcionario");

        ate_funcionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ate_cadastrar.setText("CADASTRAR");

        ate_atualizar.setText("ATUALIZAR");
        ate_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ate_atualizarActionPerformed(evt);
            }
        });

        ate_fechar.setText("FECHAR");

        ate_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "dentista", "cliente", "servico", "funcionario", "data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(ate_table);

        javax.swing.GroupLayout atendimentoLayout = new javax.swing.GroupLayout(atendimento);
        atendimento.setLayout(atendimentoLayout);
        atendimentoLayout.setHorizontalGroup(
            atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atendimentoLayout.createSequentialGroup()
                        .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(ate_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(ate_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(ate_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE))
                    .addGroup(atendimentoLayout.createSequentialGroup()
                        .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ate_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel22)
                                .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ate_dentista, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ate_data, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atendimentoLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atendimentoLayout.createSequentialGroup()
                        .addComponent(ate_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ate_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ate_fechar)
                        .addGap(167, 167, 167))))
        );
        atendimentoLayout.setVerticalGroup(
            atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atendimentoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ate_cadastrar)
                    .addComponent(ate_atualizar)
                    .addComponent(ate_fechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(atendimentoLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ate_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addComponent(ate_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(175, Short.MAX_VALUE))
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

    private void cli_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cli_cadastrarActionPerformed
        if(cli_id.getText().isEmpty() || cli_nome.getText().isEmpty() || cli_cpf.getText().isEmpty() || cli_email.getText().isEmpty() || cli_numero.getText().isEmpty() || cli_rua.getText().isEmpty() || cli_bairro.getText().isEmpty() || cli_cidade.getText().isEmpty() || cli_estado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        else {
            clienteDAO insert = new clienteDAO();
            cliente cli = new cliente();
            
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
    }//GEN-LAST:event_cli_cadastrarActionPerformed

    private void fun_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fun_cadastrarActionPerformed
        if(fun_id.getText().isEmpty() || fun_nome.getText().isEmpty() || fun_ctps.getText().isEmpty() || fun_tel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        else {
            funcionarioDAO insert = new funcionarioDAO();
            funcionario fun = new funcionario();
            
            fun.setNome(fun_nome.getText());
            fun.setCtps(fun_ctps.getText());
            fun.setTel(fun_tel.getText());
            
            insert.cadastro(fun);
        }
    }//GEN-LAST:event_fun_cadastrarActionPerformed

    private void esp_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esp_cadastrarActionPerformed
        if(esp_id.getText().isEmpty() || esp_nome.getText().isEmpty() || esp_desc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        else {
            especialidadeDAO insert = new especialidadeDAO();
            especialidade esp = new especialidade();
            
            esp.setNome(esp_nome.getText());
            esp.setDesc(esp_desc.getText());
            
            insert.cadastro(esp);
        }
    }//GEN-LAST:event_esp_cadastrarActionPerformed

    private void den_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_den_cadastrarActionPerformed
        if(den_id.getText().isEmpty() || den_nome.getText().isEmpty() || den_cro.getText().isEmpty() || den_tel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        else {
            especialidadeDAO insert = new especialidadeDAO();
            especialidade esp = new especialidade();
            
            esp.setNome(esp_nome.getText());
            esp.setDesc(esp_desc.getText());
            
            insert.cadastro(esp);
        }
    }//GEN-LAST:event_den_cadastrarActionPerformed

    private void cli_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cli_atualizarActionPerformed
        atualizarCliente();
    }//GEN-LAST:event_cli_atualizarActionPerformed

    private void fun_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fun_atualizarActionPerformed
        atualizarFuncionario();
    }//GEN-LAST:event_fun_atualizarActionPerformed

    private void esp_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esp_atualizarActionPerformed
        atualizarEspecialidade();
    }//GEN-LAST:event_esp_atualizarActionPerformed

    private void den_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_den_atualizarActionPerformed
        atualizarDentista();
    }//GEN-LAST:event_den_atualizarActionPerformed

    private void ser_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ser_atualizarActionPerformed
        atualizarServicos();
    }//GEN-LAST:event_ser_atualizarActionPerformed

    private void ate_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ate_atualizarActionPerformed
        atualizarAtendimentos();
    }//GEN-LAST:event_ate_atualizarActionPerformed

    //Start (Listas)
    private void listaClientes() {
        try {
            clienteDAO dados = new clienteDAO();
            ArrayList<cliente> lista = dados.carregarDados();
            DefaultTableModel model = (DefaultTableModel) cli_table.getModel();

            for(int linha = 0; linha < model.getRowCount(); linha++) {
                model.removeRow(linha);
            }

            if(!lista.isEmpty()) {
                for(int index = 0; index < lista.size(); index++) {
                    model.addRow(new Object[] {
                        lista.get(index).getCliente_id(),
                        lista.get(index).getNome(),
                        lista.get(index).getCpf(),
                        lista.get(index).getEmail(),
                        lista.get(index).getNumero(),
                        lista.get(index).getRua(),
                        lista.get(index).getBairro(),
                        lista.get(index).getCidade(),
                        lista.get(index).getEstado()
                    });
                }
            }
            else {
              JOptionPane.showMessageDialog(rootPane, "Não há registros");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    
    private void listaFuncionarios() {
        try {
            funcionarioDAO dados = new funcionarioDAO();
            ArrayList<funcionario> lista = dados.carregarDados();
            DefaultTableModel model = (DefaultTableModel) fun_table.getModel();

            for(int linha = 0; linha < model.getRowCount(); linha++) {
                model.removeRow(linha);
            }

            if(!lista.isEmpty()) {
                for(int index = 0; index < lista.size(); index++) {
                    model.addRow(new Object[] {
                        lista.get(index).getFuncionario_id(),
                        lista.get(index).getNome(),
                        lista.get(index).getCtps(),
                        lista.get(index).getTel()
                    });
                }
            }
            else {
              JOptionPane.showMessageDialog(rootPane, "Não há registros");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    
    private void listaEspecialidades() {
        try {
            especialidadeDAO dados = new especialidadeDAO();
            ArrayList<especialidade> lista = dados.carregarDados();
            DefaultTableModel model = (DefaultTableModel) esp_table.getModel();

            for(int linha = 0; linha < model.getRowCount(); linha++) {
                model.removeRow(linha);
            }

            if(!lista.isEmpty()) {
                for(int index = 0; index < lista.size(); index++) {
                    model.addRow(new Object[] {
                        lista.get(index).getEspecialidade_id(),
                        lista.get(index).getNome(),
                        lista.get(index).getDesc()
                    });
                }
            }
            else {
              JOptionPane.showMessageDialog(rootPane, "Não há registros");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    
    private void listaDentistas() {
        try {
            dentistaDAO dados = new dentistaDAO();
            ArrayList<dentista> lista = dados.carregarDados();
            DefaultTableModel model = (DefaultTableModel) den_table.getModel();

            for(int linha = 0; linha < model.getRowCount(); linha++) {
                model.removeRow(linha);
            }

            if(!lista.isEmpty()) {
                for(int index = 0; index < lista.size(); index++) {
                    model.addRow(new Object[] {
                        lista.get(index).getDentista_id(),
                        lista.get(index).getEspecialidade_id(),
                        lista.get(index).getNome(),
                        lista.get(index).getCro(),
                        lista.get(index).getTel()
                    });
                }
            }
            else {
              JOptionPane.showMessageDialog(rootPane, "Não há registros");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    
    private void listaServicos() {
        try {
            servicoDAO dados = new servicoDAO();
            ArrayList<servico> lista = dados.carregarDados();
            DefaultTableModel model = (DefaultTableModel) ser_table.getModel();

            for(int linha = 0; linha < model.getRowCount(); linha++) {
                model.removeRow(linha);
            }

            if(!lista.isEmpty()) {
                for(int index = 0; index < lista.size(); index++) {
                    model.addRow(new Object[] {
                        lista.get(index).getServico_id(),
                        lista.get(index).getDesc(),
                        lista.get(index).getDuracao(),
                        lista.get(index).getValor()
                    });
                }
            }
            else {
              JOptionPane.showMessageDialog(rootPane, "Não há registros");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    
    private void listaAtendimentos() {
        try {
            atendimentoDAO dados = new atendimentoDAO();
            ArrayList<atendimento> lista = dados.carregarDados();
            DefaultTableModel model = (DefaultTableModel) ate_table.getModel();

            for(int linha = 0; linha < model.getRowCount(); linha++) {
                model.removeRow(linha);
            }

            if(!lista.isEmpty()) {
                for(int index = 0; index < lista.size(); index++) {
                    model.addRow(new Object[] { //Mudar essa linha
                        lista.get(index).getAtendimento_id(),
                        lista.get(index).getDentista_id(),
                        lista.get(index).getCliente_id(),
                        lista.get(index).getServico_id(),
                        lista.get(index).getFuncionario_id(),
                        lista.get(index).getData()
                    });
                }
            }
            else {
              JOptionPane.showMessageDialog(rootPane, "Não há registros");
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
    //End (Listas)
    
    //Start (Atualizar)
    private void atualizarCliente() {
        cliente cli = new cliente();
        clienteDAO dados = new clienteDAO();
        
        cli.setCliente_id(Integer.parseInt(cli_id.getText()));
        cli.setNome(cli_nome.getText());
        cli.setCpf(cli_cpf.getText());
        cli.setEmail(cli_email.getText());
        cli.setNumero(cli_numero.getText());
        cli.setRua(cli_rua.getText());
        cli.setBairro(cli_bairro.getText());
        cli.setCidade(cli_cidade.getText());
        cli.setEstado(cli_estado.getText());
        
        dados.atualizaDados(cli);
        
        cli_id.setText("");
        cli_nome.setText("");
        cli_cpf.setText("");
        cli_email.setText("");
        cli_numero.setText("");
        cli_rua.setText("");
        cli_bairro.setText("");
        cli_cidade.setText("");
        cli_estado.setText("");
        
        listaClientes();
    }
    
    private void atualizarFuncionario() {
        funcionario fun = new funcionario();
        funcionarioDAO dados = new funcionarioDAO();

        fun.setFuncionario_id(Integer.parseInt(fun_id.getText()));
        fun.setNome(fun_nome.getText());
        fun.setCtps(fun_ctps.getText());
        fun.setTel(fun_tel.getText());
        
        dados.atualizaDados(fun);
        
        fun_id.setText("");
        fun_nome.setText("");
        fun_ctps.setText("");
        fun_tel.setText("");
        
        listaFuncionarios();
    }
    
    private void atualizarEspecialidade() {
        especialidade esp = new especialidade();
        especialidadeDAO dados = new especialidadeDAO();

        esp.setEspecialidade_id(Integer.parseInt(esp_id.getText()));
        esp.setNome(esp_nome.getText());
        esp.setDesc(esp_desc.getText());
        
        dados.atualizaDados(esp);
        
        esp_id.setText("");
        esp_nome.setText("");
        esp_desc.setText("");
        
        listaEspecialidades();
    }
    
    private void atualizarDentista() {
        dentista den = new dentista();
        dentistaDAO dados = new dentistaDAO();

        den.setDentista_id(Integer.parseInt(den_id.getText()));
        den.setEspecialidade_id(den_esp.getSelectedIndex());
        den.setNome(den_nome.getText());
        den.setCro(den_cro.getText());
        den.setTel(den_tel.getText());
        
        dados.atualizaDados(den);
        
        den_id.setText("");
        den_nome.setText("");
        den_cro.setText("");
        den_id.setText("");
        
        listaDentistas();
    }
    
    private void atualizarServicos() {
        servico ser = new servico();
        servicoDAO dados = new servicoDAO();

        ser.setServico_id(Integer.parseInt(ser_id.getText()));
        ser.setDesc(ser_descricao.getText());
        ser.setDuracao(ser_duracao.getText());
        ser.setValor(Double.parseDouble(ser_valor.getText()));
        
        dados.atualizaDados(ser);
        
        ser_id.setText("");
        ser_descricao.setText("");
        ser_duracao.setText("");
        ser_valor.setText("");
        
        listaServicos();
    }
    
    private void atualizarAtendimentos() {
        atendimento ate = new atendimento();
        atendimentoDAO dados = new atendimentoDAO();

        ate.setAtendimento_id(Integer.parseInt(ate_id.getText()));
        ate.setDentista_id(ate_dentista.getSelectedIndex());
        ate.setCliente_id(ate_cliente.getSelectedIndex());
        ate.setServico_id(ate_servico.getSelectedIndex());
        ate.setFuncionario_id(ate_funcionario.getSelectedIndex());
        ate.setData(ate_data.getText());
        
        dados.atualizaDados(ate);
        
        ate_id.setText("");
        ate_data.setText("");
        
        listaAtendimentos();
    }
    //End (Atualizar)
    
    //Start (Carregar campos)
    private void carregarCliente() {
        int index = cli_table.getSelectedRow();
        
        cli_id.setText(cli_table.getModel().getValueAt(index, 0).toString());
        cli_nome.setText(cli_table.getModel().getValueAt(index, 1).toString());
        cli_cpf.setText(cli_table.getModel().getValueAt(index, 2).toString());
        cli_email.setText(cli_table.getModel().getValueAt(index, 3).toString());
        cli_numero.setText(cli_table.getModel().getValueAt(index, 4).toString());
        cli_rua.setText(cli_table.getModel().getValueAt(index, 5).toString());
        cli_bairro.setText(cli_table.getModel().getValueAt(index, 6).toString());
        cli_cidade.setText(cli_table.getModel().getValueAt(index, 7).toString());
        cli_estado.setText(cli_table.getModel().getValueAt(index, 8).toString());
    }
    
    private void carregarFuncionario() {
        int index = fun_table.getSelectedRow();
        
        fun_id.setText(fun_table.getModel().getValueAt(index, 0).toString());
        fun_nome.setText(fun_table.getModel().getValueAt(index, 1).toString());
        fun_ctps.setText(cli_table.getModel().getValueAt(index, 2).toString());
        fun_tel.setText(cli_table.getModel().getValueAt(index, 3).toString());
    }
    
    private void carregarEspecialidade() {
        int index = esp_table.getSelectedRow();
        
        esp_id.setText(esp_table.getModel().getValueAt(index, 0).toString());
        esp_nome.setText(esp_table.getModel().getValueAt(index, 1).toString());
        esp_desc.setText(esp_table.getModel().getValueAt(index, 2).toString());
    }
    
    private void carregarDentista() {
        int index = den_table.getSelectedRow();
        
        den_id.setText(den_table.getModel().getValueAt(index, 0).toString());
        den_esp.setSelectedIndex(Integer.parseInt(den_table.getModel().getValueAt(index, 1).toString()));
        den_nome.setText(den_table.getModel().getValueAt(index, 2).toString());
        den_cro.setText(den_table.getModel().getValueAt(index, 3).toString());
        den_tel.setText(den_table.getModel().getValueAt(index, 4).toString());
    }
    
    private void carregarServico() {
        int index = ate_table.getSelectedRow();
        
        ser_id.setText(ser_table.getModel().getValueAt(index, 0).toString());
        ser_descricao.setText(ser_table.getModel().getValueAt(index, 1).toString());
        ser_duracao.setText(ser_table.getModel().getValueAt(index, 2).toString());
        ser_valor.setText(ser_table.getModel().getValueAt(index, 3).toString());
    }
    
    private void carregarAtendimento() {
        int index = ate_table.getSelectedRow();
        
        ate_id.setText(ate_table.getModel().getValueAt(index, 0).toString());
        ate_dentista.setSelectedIndex(Integer.parseInt(ate_table.getModel().getValueAt(index, 1).toString()));
        ate_cliente.setSelectedIndex(Integer.parseInt(ate_table.getModel().getValueAt(index, 2).toString()));
        ate_servico.setSelectedIndex(Integer.parseInt(ate_table.getModel().getValueAt(index, 3).toString()));
        ate_funcionario.setSelectedIndex(Integer.parseInt(ate_table.getModel().getValueAt(index, 4).toString()));
        ate_data.setText(ate_table.getModel().getValueAt(index, 5).toString());
    }
    //End (Carregar campos)
    
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
    private javax.swing.JComboBox<String> ate_cliente;
    private javax.swing.JTextField ate_data;
    private javax.swing.JComboBox<String> ate_dentista;
    private javax.swing.JButton ate_fechar;
    private javax.swing.JComboBox<String> ate_funcionario;
    private javax.swing.JTextField ate_id;
    private javax.swing.JComboBox<String> ate_servico;
    private javax.swing.JTable ate_table;
    private javax.swing.JPanel atendimento;
    private javax.swing.JButton cli_atualizar;
    private javax.swing.JTextField cli_bairro;
    private javax.swing.JButton cli_cadastrar;
    private javax.swing.JTextField cli_cidade;
    private javax.swing.JTextField cli_cpf;
    private javax.swing.JTextField cli_email;
    private javax.swing.JTextField cli_estado;
    private javax.swing.JButton cli_fechar;
    private javax.swing.JTextField cli_id;
    private javax.swing.JTextField cli_nome;
    private javax.swing.JTextField cli_numero;
    private javax.swing.JTextField cli_rua;
    private javax.swing.JTable cli_table;
    private javax.swing.JPanel cliente;
    private javax.swing.JButton den_atualizar;
    private javax.swing.JButton den_cadastrar;
    private javax.swing.JTextField den_cro;
    private javax.swing.JComboBox<String> den_esp;
    private javax.swing.JButton den_fechar;
    private javax.swing.JTextField den_id;
    private javax.swing.JTextField den_nome;
    private javax.swing.JTable den_table;
    private javax.swing.JTextField den_tel;
    private javax.swing.JPanel dentista;
    private javax.swing.JButton esp_atualizar;
    private javax.swing.JButton esp_cadastrar;
    private javax.swing.JTextField esp_desc;
    private javax.swing.JButton esp_fechar;
    private javax.swing.JTextField esp_id;
    private javax.swing.JTextField esp_nome;
    private javax.swing.JTable esp_table;
    private javax.swing.JPanel especialidade;
    private javax.swing.JButton fun_atualizar;
    private javax.swing.JButton fun_cadastrar;
    private javax.swing.JTextField fun_ctps;
    private javax.swing.JButton fun_fechar;
    private javax.swing.JTextField fun_id;
    private javax.swing.JTextField fun_nome;
    private javax.swing.JTable fun_table;
    private javax.swing.JTextField fun_tel;
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
    private javax.swing.JTextField ser_descricao;
    private javax.swing.JTextField ser_duracao;
    private javax.swing.JButton ser_fechar;
    private javax.swing.JTextField ser_id;
    private javax.swing.JTable ser_table;
    private javax.swing.JTextField ser_valor;
    private javax.swing.JPanel servico;
    // End of variables declaration//GEN-END:variables
}