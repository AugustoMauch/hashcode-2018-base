# hashcode-2018-base

### Contenido del proyecto 

online_qualification_round_2018.pdf -> descripción del reto
datasets/*.in -> input datasets del reto
datasets/visualized/*.png -> representación grafica parcial de los datasets
output/ -> carpeta donde guardar los resultados. Contiene un resultado de ejemplo para el dataset de prueba
src -> fuentes básicas para leer los datasets y para evaluar los ficheros de resultados


### Lectura de un dataset de entrada
Ejemplo de lectura de un input dataset en ChallengeReader.java


### Evaluación de un fichero de resultado

Ejemplo de evaluación de un resultado en Scorer.java

Para evaluar un resultado desde línea de comandos:

java -cp scorer.jar hashcode.qualification.scorer.ChallengeScorer path_a_input_dataset path_a_fichero_resultados