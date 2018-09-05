package com.ucentral.edu.modelo;
import static com.ucentral.edu.modelo.Token.*;

%%
%class Lexer
%type Token
%public
%full

L = [a-zA-Z_]
D = [0-9]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
(WHITE) {/*Ignore*/}
"=" {return ASSIGN;}
"+" {return SUMA;}
"*" {return MULT;}
"-" {return RESTA;}
"/" {return DIV;}
"programa" {return RESERVADA;}
"int" {return RESERVADA;}
"int" {return RESERVADA;}
"char" {return RESERVADA;}
"float" {return RESERVADA;}
"leer" {return RESERVADA;}
"imprimir" {return RESERVADA;}
"terminar" {return RESERVADA;}
"mientras" {return RESERVADA;}
"si" {return RESERVADA;}
"sino" {return RESERVADA;}

{L}({L}|{D})* {lexeme=yytext(); return VARIABLE;}
 ("(-"{D}+")")|{D}+ {lexeme=yytext(); return NUMERO;}
. {return ERROR;}
