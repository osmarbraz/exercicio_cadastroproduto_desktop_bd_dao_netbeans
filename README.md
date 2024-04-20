# Exercício - Sistema de Cadastro de Produtos para Desktop em Banco MySQL utilizando DAO para a IDE NetBeans.

## Contextualização

 - O projeto foi desenvolvido no NetBeans deve ser chamado exercicio_cadastroproduto_desktop_bd_dao_netbeans.<br>
 - Programa desenvolvido no Java Development Kit 1.8.<br>
 - Utiliza o Apache Maven para a automatização da construção.<br>
 - Este programa possui diversas classes organizada nos pacotes: principal, visao, modelo e dao.<br>
 - Utiliza o Data Acess Object (DAO) para abstrair o bancos de dados MySQL.<br>
 - Toda iteração com banco de dados é tratada diretamente pelo DAO.<br>
 - Os dados de configuração(Servidor, Database, Usuario, Senha) da integração do java com o banco de dados estão no arquivo src/dao/DadosBanco.java.<br>
 - Dependência do Driver JDBC foi especificada no arquivo pom.xml.<br>
 - O Driver de conexão com o MySQL e espeficado na classe Conexao.java.<br>
 - Crie o banco de dados antes de executar o programa, as especificações da tabela estão no arquivo banco.sql.<br>
 - A pasta src contêm os fontes do projeto.<br>
 - A interface gráfica foi construída **com** o auxílio da IDE NetBeans.<br>

## Arquivos

- banco.sql - Script do banco de dados.
- pom.xml - Arquivo de configuração da ferramenta de automação Maven.

## Enunciado do problema

### Questão 1

Uma empresa necessita de um sistema para desktop em Java para cadastrar os seus produtos em um banco de dados. As informações referentes a cada produto que devem ser preenchidas são as seguintes: Nome, Preço Custo, Preço Venda, Unidade e Categoria. A tabela e o banco de dados têm o nome “produto”. A tabela tem a seguinte estrutura:

CREATE TABLE produto (
	produtoID    INTEGER NOT NULL AUTO_INCREMENT,    	 
	nome          VARCHAR(50) NOT NULL,     
	precoVenda DECIMAL(9,2) NOT NULL,     
	precoCusto  DECIMAL(9,2) NOT NULL,     
	unidade   	VARCHAR(2),	
	categoria    	VARCHAR(25),
	PRIMARY KEY(produtoID)    
);

O layout do janela é apresentado abaixo:

![tela1](tela1.png)   

Este interface gráfica, além dos campos, possui seis botões. O botão com o nome "Sair" fecha a janela e sai do sistema. O botão com o nome “Limpar” limpa as caixas de texto da janela. Quando for clicado, o botão “Salvar” enviará as informações ao banco de dados. A caixa de texto para o nome do produto deve ter o seu preenchimento obrigatório, faça a validação. As funcionalidades dos outros botões serão implementadas posteriormente.

Desenvolva uma interface gráfica baseada em JFrame do pacote Swing para o cadastro de produtos, contendo as informações acima. Utilize o banco de dados de sua preferência. Ao final do processamento deve ser exibida uma mensagem informando se o usuário conseguiu ou não realizar a inclusão dos dados.

Você deve apresentar todo o código fonte utilizado para desenvolver a interface e a inclusão no banco de dados. Outras janelas podem ser criadas para integrar as funcionalidades do sistema se for necessário.

### Questão 2

Você já realizou a inclusão dos dados de produtos no banco de dados na questão 1. Agora, a mesma empresa necessita listar os dados de seus produtos que estão armazenados no banco de dados. A chamada desta funcionalidade será através do botão chamado “Listar” da questão anterior. As informações e o layout dos dados a serem exibidos são apresentados na figura abaixo:

![tela2](tela2.png) 

Desenvolva uma interface gráfica baseada em JFrame que contêm um componente JTable para exibir os dados de produtos armazenados.  Utilize o mesmo banco e tabela da questão 1. Ao se clicar no botão “Fechar” deve se retornar a janela anterior.

Você deve apresentar todo o código fonte utilizado para desenvolver o cadastro. Outras interfaces gráficas podem ser criadas para integrar as funcionalidades do sistema.

### Questão 3

Após realizar a listagem dos dados na questão 2, a empresa necessita disponibilizar uma interface gráfica para a alteração dos dados de seus produtos que estão armazenados no banco de dados. Para localizar o produto cujos dados devem ser alterados é necessário ser informado um o id do produto. A interface deve ter o seguinte formato:

![tela3](tela3.png) 

Esta interface gráfica deve ser chamada pelo botão “Alterar” da interface gráfica da questão 1.

Logo após a digitação do id os dados do produto devem ser exibidos na interface gráfica desenvolvida na questão 1 para que sejam alterados. Se o id do produto não existir, deve ser exibida uma mensagem ao usuário. O botão “Cadastrar” altera os dados do produto. Utilize o mesmo banco e tabela da questão 1. 

Você deve apresentar todo o código fonte utilizado para desenvolver o cadastro. Outras interfaces gráficas podem ser criadas para integrar as funcionalidades do sistema.

### Questão 4

Com as funcionalidades de inclusão, listagem e alteração dos dados de produtos prontas, agora a empresa necessita disponibilizar a interface gráfica para a exclusão dos dados de produtos que estão armazenados no banco de dados. Para localizar o produto a ser excluído do banco de dados é necessário ser informado um id de produto. A interface gráfica deve ter o seguinte formato:

![tela4](tela4.png) 

Esta interface gráfica deve ser chamada pelo botão “Excluir” da interface gráfica da questão 1.

Logo após a digitação do id, todos os dados do produto que foi localizado deve ser exibido na interface gráfica desenvolvida na questão 1 e logo após é exigido a confirmação da exclusão com a interface a seguir:

![tela5](tela5.png) 

Se o id do produto não existir, deve ser exibida uma mensagem ao usuário. Utilize o mesmo banco e tabela da questão 1. 

Você deve apresentar todo o código fonte utilizado para desenvolver o cadastro. Outras interfaces gráficas podem ser criadas para integrar as funcionalidades do sistema. 

