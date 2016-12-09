grammar Grammatik;
	
tipo:
	|'Numerisch'
	;

op_atribuicao
	:
	|'<-'
	;

op_condicional
	:
	|'Gleich'
	|'Anders'
	|'Groessrer'
	|'Kleiner'
	;
	
op_logica
	:
	|'Und'
	|'Oder'
	|'Nein'
	;

op_condicional_se
	:
	|'Ob'
	;
	
op_mostra
	:
	|'Anzeigen'
	;

op_matematica
	:
	|'Summe'
	|'Subtraktion'
	|'Multiplikation'
	|'Aufteilung'
	;

exp_mostra
	:
	|op_mostra ' ' ID_PALAVRA ';'
	;

exp_se
	:
	|op_condicional_se ' ' exp_logica ' ' 'Anfang' ' ' exp_matematica ' ' 'Ende'
	|op_condicional_se ' ' exp_logica ' ' 'Anfang' ' ' exp_atribuicao ' ' 'Ende'
	;
	
exp_logica
	:
	|exp_condicional
	|exp_condicional ' ' op_logica ' ' exp_condicional
	;

exp_condicional
	:
	|ID_PALAVRA ' ' op_condicional ' ' ID_PALAVRA
	|ID_PALAVRA ' ' op_condicional ' ' ID_NUMERICO
	|ID_NUMERICO ' ' op_condicional ' ' ID_PALAVRA
	|ID_NUMERICO ' ' op_condicional ' ' ID_NUMERICO
	;

exp_matematica
	:
	|ID_NUMERICO ' ' op_matematica ' '  ID_NUMERICO ';'
	|ID_PALAVRA ' ' op_matematica ' ' ID_NUMERICO ';'
	|ID_PALAVRA ' ' op_matematica ' ' ID_PALAVRA ';'
	|ID_NUMERICO ' ' op_matematica ' ' ID_PALAVRA ';'
	
	;

exp_atribuicao
	:
	|ID_PALAVRA ' ' op_atribuicao ' ' ID_NUMERICO ';'
	|ID_PALAVRA ' ' op_atribuicao ' ' exp_matematica
	|ID_PALAVRA ' ' op_atribuicao ' ' ID_PALAVRA ';'
	;

dec_variavel
	:
	|ID_PALAVRA ' ' tipo ';'
	;

ID_PALAVRA
	:
	|('A'..'Z'|'a'..'z')('A'..'Z'|'a'..'z'|'0'..'9'|'_')*
	;

ID_NUMERICO
	:
	|('0'..'9')+ ('.' ('0'..'9')+)?
	;