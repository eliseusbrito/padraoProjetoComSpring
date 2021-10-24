# Padrão de Projeto com Spring Framework

Repositório com as implementações dos padrões de projeto explorando alguns padrões usando o Spring Framework, são eles:
- Singleton
- Strategy/Repository
- Facade

Este projeto integra com API que busca de forma automática o gênero do cliente. Este tipo de informação serve para se ter conhecimento da base de dados, como por exemplo, se o público  é predominante masculino ou feminino, e poder tratar as estratégias do negócio para que atinja melhor o seu público. Desta forma a informação é obtida mesmo sem o cliente fornecer com uma pequena margem de erro, pois a APi traz esta informação também.


Link da API utilizada: https://api.genderize.io

Exemplos de utilização: https://genderize.io/use-cases

Outras integrações neste mesmo sentido também estão disponiveis em: 

* Predict the nationality of a name: https://nationalize.io/

* Determine the gender of a name: https://genderize.io/

Foi acrescentado também uma base de dados inicial para facilitar o estudo do projeto implementando o CommandLineRunner do Java com banco H2. 
