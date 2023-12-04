CREATE TABLE funcionario (
    id_funcionario INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(20),
    sobrenome VARCHAR(20),
    admissao DATE,
    profissao VARCHAR(30)
);

CREATE TABLE pagamento (
    id_funcionario INT,
    salarioBruto DOUBLE,
    salarioLiquido DOUBLE,
    salarioHora DOUBLE,
    dataEmissaoPagamento DATE,
    valorFGTS DOUBLE,
    valorINSS DOUBLE,
    valorIRRF DOUBLE,
    valorInsalubridade DOUBLE,
    valorPericulosidade DOUBLE,
    valorValeAlimentacao DOUBLE,
    valorValeRefeicao DOUBLE,
    FOREIGN KEY (id_funcionario) REFERENCES funcionario(id_funcionario)
);