# Trabalho feito para a disciplina de programação de soluções computacionais - 02/2023 - Professor Diego Barros


<div align="center">

### Ferramentas usadas
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" /> <img src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white" />

### Membros do grupo 🙍‍♂

Todos os membros (Andrey, Bruno, Luiz, Messias, Thiago e Victor) estão associados a esse repositório.

</div>

# Considerações

Para que o projeto seja inicializado são necessários o jdk e o mySQL instalados em sua máquina. A pasta resources dentro do projeto contem o banco de dados e o script para que sejam criadas as tabelas. O driver jdbc também está na pasta resources. Na classe ConnectionFactory faça as conexões com o banco passando seu username, senha e caminho da sua instância local.

# Proposta do projeto

A proposta do projeto é criar uma aplicação que cadastre funcionários, faça calculos de pagamentos e armazene em um banco de dados

# Características do Produto

O sistema deve permitir que o usuário obtenha o valor do salário por hora a partir do salário bruto informado.
</br>
</br>
O sistema deve permitir que o usuário calcule os adicionais de periculosidade e insalubridade, caso o funcionário seja apto em receber esses adicionais no salário.
</br>
</br>
O sistema deve permitir que o usuário calcule os benefícios de vale transporte e vale alimentação.
</br>
</br>
O sistema deve permitir que o usuário calcule os descontos de INSS, FGTS e IRRF.
</br>
</br>
O sistema calcular o salário líquido do funcionário, ou seja, seu salário final após todos os benefícios e descontos serem considerados.
</br>
</br>
O sistema deve mostrar na tela para o usuário os cálculos da folha de pagamento.
</br>
</br>
O sistema deve armazenar informações dos funcionários e dos seus pagamentos recebidos.

</br>

# Requisitos funcionais 

Requisitos Funcionais cumpridos: Todos ✅
</br>
Requisitos funcionais não cumpridos: ❌

RF1 - Calcular Salário Hora: O sistema deve ser capaz de calcular o valor do salário por hora de um funcionário  à partir do seu salário bruto ✅
</br>
</br>
RF2 - Calcular Periculosidade: O sistema deve ser capaz de verificar se o funcionário é apto ao adicional periculosidade e realizar o cálculo ✅
</br>
</br>
RF3 - Calcular Insalubridade: O sistema deve ser capaz de verificar se o funcionário é apto ao adicional insalubridade e realizar o cálculo ✅
</br>
</br>
RF4 - Calcular Vale Transporte: O sistema deve ser capaz de calcular o benefício de vale transporte ✅
</br>
</br>
RF5  - Calcular Vale Alimentação: O sistema deve ser capaz de calcular o benefício de vale alimentação ✅
</br>
</br>
RF6 - Calcular Desconto de INSS: O sistema deve ser capaz de calcular o desconto de INSS ✅
</br>
</br>
RF7  - Calcular FGTS: O sistema deve ser capaz de calcular o desconto de FGTS ✅
</br>
</br>
RF8 - Calcular Desconto de IRRF: O sistema deve ser capaz de calcular o desconto de IRRF ✅
</br>
</br>
RF9 - Calcular Salário Líquido: O sistema deve ser capaz de calcular o salário líquido do funcionário ✅
</br>
</br>

# Requisitos Não Funcionais 

#### Usabilidade: 
O sistema deverá ser fácil de usar e todas mensagens mostradas na tela deverão estar muito bem escritas e formatadas ✅

#### Manutenabilidade: 
O software deverá ser desenvolvido usando o paradigma Orientado a Objetos; com baixo acoplamento e alta coesão ✅
</br>
O código deverá estar limpo, muito bem organizado e estruturado, seguindo as boas práticas da programação estruturada ✅
</br>
O código fonte deverá seguir as convenções de código da linguagem de programação Java ✅

#### Requisitos Tecnológicos:

O sistema deverá ser implementado usando a linguagem de programação Java ✅
</br>
O sistema deverá armazenar os dados em um banco de dados relacional ✅

#### Requisitos Extra:

Esta seção define alguns requisitos opcionais que foram sugeridos pelo professor.

O sistema deverá ter uma interface gráfica do Usuário (GUI) ❌
</br>
O sistema deve implementar em sua interface gráfica de linha de comando, caracteres de desenhos de caixas, reproduzindo um visual retrô semelhante a interface MS-DOS ❌
</br>
O sistema deve utilizar a classe BigDecimal para a realização dos cálculos ❌
</br>
O sistema deverá verificar automaticamente quantas semanas tem o mês corrente ❌
</br>
O sistema deve ser capaz de mostrar na tela o relatório da folha de pagamento ✅
