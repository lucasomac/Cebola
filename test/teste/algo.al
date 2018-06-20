/*
	Universidade Federal de Sergipe
	Departamento de Computacao
	
	Compilador Portugol - programa de teste semantico negativo 1

	Professor: Kalil Araujo Bispo
	Alunos:    Breno Cruz
		   	   Claudio Mota Oliveira
*/

programa ProgramaDeTeste
inicio
	const Desenvolvedor1 'Breno Cruz';
	const Desenvolvedor2 'Claudio Mota';
	const numeroReal 2,25;
	inteiro : iterador, opcao , Inteiro, ultimo, entrada[0];
	caractere: alpha, alfabeto[26];
	real: numeroReal2;		
	iterr := entrada[opcao+24,5]*2;
	Inteiro := numeroReal;
	escreva('Olá mundo\n');	
	escreva('Qual operacao deseja fazer?\n');
	leia(opcao[0]);
	leia(entrada);
	
	se(alpha<2) entao
		a := 2,5* (3+2)/(4+alpha);
	senao
		leia(alfabeto);
		escreva(alfabeto+2);
	fim se;
	
	avalie ((opcao*2 -2)/2)
		caso 0:
			iterador := 1;
			repita
				escreva('i = ');
				escreva(iterador);
				escreva('\n');
				iterador := iterador + 1;
			ate (iterador >= 20);
		caso 'a':
			para iterador de 1 ate 20 faca
				escreva('i = ');
				escreva(iterador);
				escreva('\n');
			fim para;
		caso 2:	
			enquanto (iterador*(3*i-2) <= 50*iterador) faca
				escreva(iterador);
				iterador := iterador*2;
			fim enquanto;
		caso 3:
			para iterador de 1 passo 2 ate 40 faca
				escreva('i = ');
				escreva(iterador);
				escreva('\n');
			fim para;
		caso 4:
			leia(entrada[opcao]);
			se (nao(entrada[opcao] / (1+(opcao*entrada[opcao]*entrada[opcao])) >= 1)) entao  // OUTRO EXEMPLO: se(nao(43 = 2))
				
				opcao := -(-5*-opcao);
				
				se (-(2*4)>37/2 = 2<1) entao escreva(1); fim se;
				se (((2=3) = (2=3)) e (3 > 2) ) entao escreva(2); fim se;
				se (2<3 e 4>5 ou 5=5) entao escreva(3); fim se;
				se ((1<2 = 2>3) = nao (nao (2<3) e 3>=3)) entao leia(a);fim se; //correto
				
				escreva('se:...\n');
			senao			
				escreva('se nao:...\n');
			fim se;
		senao:
			escreva('Opcao invalida!');
	fim avalie;

	escreva('\nFim de execução...');
fim.
