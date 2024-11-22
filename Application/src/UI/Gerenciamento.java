package UI;

import DAO.*;
import DTO.*;
import javax.swing.JOptionPane;

public class Gerenciamento extends javax.swing.JFrame {
    public Gerenciamento() {
        initComponents();
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
        cli_fechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cli_table = new javax.swing.JTable();
        funcionario = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        fun_nome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fun_ctps = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fun_telefone = new javax.swing.JTextField();
        fun_cadastrar = new javax.swing.JButton();
        fun_atualizar = new javax.swing.JButton();
        fun_fechar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fun_table = new javax.swing.JTable();
        especialidade = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        esp_nome = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        esp_descricao = new javax.swing.JTextField();
        esp_cadastrar = new javax.swing.JButton();
        esp_atualizar = new javax.swing.JButton();
        esp_fechar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        esp_table = new javax.swing.JTable();
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
        den_fechar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        den_table = new javax.swing.JTable();
        servico = new javax.swing.JPanel();
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
        jLabel21 = new javax.swing.JLabel();
        cli_nome1 = new javax.swing.JTextField();
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
        setPreferredSize(new java.awt.Dimension(800, 600));

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
                .addGap(0, 0, Short.MAX_VALUE)
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
                .addGap(24, 24, 24)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cli_cadastrar)
                    .addComponent(cli_atualizar)
                    .addComponent(cli_fechar))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(0, 100, Short.MAX_VALUE)
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
                .addGap(24, 24, 24)
                .addGroup(funcionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(fun_cadastrar)
                    .addComponent(fun_atualizar)
                    .addComponent(fun_fechar))
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
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Atendente", funcionario);

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

        esp_fechar.setText("FECHAR");

        esp_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(esp_table);

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
                .addGap(0, 0, Short.MAX_VALUE)
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
                .addGap(24, 24, 24)
                .addGroup(especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(esp_cadastrar)
                    .addComponent(esp_atualizar)
                    .addComponent(esp_fechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(especialidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(especialidadeLayout.createSequentialGroup()
                        .addComponent(esp_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(esp_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(175, Short.MAX_VALUE))
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
        jLabel11.setText("Telefone");

        den_especialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        den_cadastrar.setText("CADASTRAR");
        den_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                den_cadastrarActionPerformed(evt);
            }
        });

        den_atualizar.setText("ATUALIZAR");

        den_fechar.setText("FECHAR");

        den_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(den_table);

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
                .addGap(0, 100, Short.MAX_VALUE)
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
                .addGap(24, 24, 24)
                .addGroup(dentistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(den_cadastrar)
                    .addComponent(den_atualizar)
                    .addComponent(den_fechar))
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
                .addContainerGap(175, Short.MAX_VALUE))
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

        ser_atualizar.setText("ATUALIZAR");

        ser_fechar.setText("FECHAR");

        ser_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(ser_table);

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
                .addGap(0, 100, Short.MAX_VALUE)
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
                .addGap(24, 24, 24)
                .addGroup(servicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ser_cadastrar)
                    .addComponent(ser_atualizar)
                    .addComponent(ser_fechar))
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
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Serviço", servico);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Data e hora");

        cli_nome1.setMinimumSize(new java.awt.Dimension(200, 40));

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

        ate_fechar.setText("FECHAR");

        ate_table.setModel(new javax.swing.table.DefaultTableModel(
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
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ate_dentista, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cli_nome1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
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
                .addGap(24, 24, 24)
                .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(ate_cadastrar)
                    .addComponent(ate_atualizar)
                    .addComponent(ate_fechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(atendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(atendimentoLayout.createSequentialGroup()
                        .addComponent(cli_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if(cli_nome.getText().isEmpty() || cli_cpf.getText().isEmpty() || cli_email.getText().isEmpty() || cli_numero.getText().isEmpty() || cli_rua.getText().isEmpty() || cli_bairro.getText().isEmpty() || cli_cidade.getText().isEmpty() || cli_estado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        else {
            cliente cli = new cliente();
            clienteDAO insert = new clienteDAO();
            
            cli.setCliente_nome(cli_nome.getText());
            cli.setCliente_cpf(cli_cpf.getText());
            cli.setCliente_email(cli_email.getText());
            cli.setCliente_numero(cli_numero.getText());
            cli.setCliente_rua(cli_rua.getText());
            cli.setCliente_bairro(cli_bairro.getText());
            cli.setCliente_cidade(cli_cidade.getText());
            cli.setCliente_estado(cli_estado.getText());
            
            insert.cadastro(cli);
        }
    }//GEN-LAST:event_cli_cadastrarActionPerformed

    private void fun_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fun_cadastrarActionPerformed
        if(fun_nome.getText().isEmpty() || fun_ctps.getText().isEmpty() || fun_telefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
        else {
            funcionario fun = new funcionario();
            funcionarioDAO insert = new funcionarioDAO();
            
            fun.setFuncionario_nome(fun_nome.getText());
            fun.setFuncionario_ctps(fun_ctps.getText());
            fun.setFuncionario_tel(fun_telefone.getText());
            
            insert.cadastro(fun);
        }
    }//GEN-LAST:event_fun_cadastrarActionPerformed

    private void esp_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esp_cadastrarActionPerformed
        // FALTA TERMINAR AQUI
        // FALTA TERMINAR AQUI
        // FALTA TERMINAR AQUI
        // FALTA TERMINAR AQUI
        // FALTA TERMINAR AQUI
        // FALTA TERMINAR AQUI
        // FALTA TERMINAR AQUI
    }//GEN-LAST:event_esp_cadastrarActionPerformed

    private void den_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_den_cadastrarActionPerformed
        // FALTA TERMINAR AQUI
        // FALTA TERMINAR AQUI
        // FALTA TERMINAR AQUI
        // FALTA TERMINAR AQUI
        // FALTA TERMINAR AQUI
        // FALTA TERMINAR AQUI
        // FALTA TERMINAR AQUI
    }//GEN-LAST:event_den_cadastrarActionPerformed

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
    private javax.swing.JComboBox<String> ate_dentista;
    private javax.swing.JButton ate_fechar;
    private javax.swing.JComboBox<String> ate_funcionario;
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
    private javax.swing.JTextField cli_nome;
    private javax.swing.JTextField cli_nome1;
    private javax.swing.JTextField cli_numero;
    private javax.swing.JTextField cli_rua;
    private javax.swing.JTable cli_table;
    private javax.swing.JPanel cliente;
    private javax.swing.JButton den_atualizar;
    private javax.swing.JButton den_cadastrar;
    private javax.swing.JTextField den_cro;
    private javax.swing.JComboBox<String> den_especialidade;
    private javax.swing.JButton den_fechar;
    private javax.swing.JTextField den_nome;
    private javax.swing.JTable den_table;
    private javax.swing.JTextField den_telefone;
    private javax.swing.JPanel dentista;
    private javax.swing.JButton esp_atualizar;
    private javax.swing.JButton esp_cadastrar;
    private javax.swing.JTextField esp_descricao;
    private javax.swing.JButton esp_fechar;
    private javax.swing.JTextField esp_nome;
    private javax.swing.JTable esp_table;
    private javax.swing.JPanel especialidade;
    private javax.swing.JButton fun_atualizar;
    private javax.swing.JButton fun_cadastrar;
    private javax.swing.JTextField fun_ctps;
    private javax.swing.JButton fun_fechar;
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
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTable ser_table;
    private javax.swing.JTextField ser_valor;
    private javax.swing.JPanel servico;
    // End of variables declaration//GEN-END:variables
}
