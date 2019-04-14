/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

/**
 *
 * @author ali
 */
import java.util.*;
public class compiler_scanner{
    
    private Dictionray<char[] , char[] > resrverd_words;
    private Dictionray<Entry , Integer > tokens;
    private Dictionray<Integer,char[]> token_names;
    private int [][] transtion_table;
    private boolean [] accept_state;
    private char [] chars ;
    private int pointer  =0;
    private int Number_Of_Errors =0;
    private int number_of_line =1;
    private FileManger manager;
    private int [] error_state ;
    public compiler_scanner(){
        tokens = new Dictionray<>();
        resrverd_words = new Dictionray<>();
        token_names = new Dictionray<>();
        manager = new FileManger();
        transtion_table = new int[36][29];
        accept_state = new boolean[50];
        resrverd_words  = manager.read("Tokens.txt");
        set_transtion(transtion_table);
        set_accept_state(accept_state);
        set_token_names(token_names);
    }
    public Dictionray<Entry , Integer > Scan(char[] words){
        char token [] = new char[100];
        int pointer =0;
        int index =0;
        while(words[pointer]!='\0'){
            if(words[pointer]!=' ' && words[pointer]!='\t' && words[pointer]!='\n' && words[pointer]!='#'){
                token[index]=words[pointer]; 
                index++;
            }else{
                
                
                Entry <char [],char []>word = Search_in_transtion_table(token);
                char [] id = {'I','D','\0'};
                if(Char_array_util.equals(word.Value(),id)){
                    
                }
                    
                index = 0;
                token  = new char[100];
               // System.out.println((char [])word.Value());
                //will be changed 
               tokens.insert(word, number_of_line);
            if(words[pointer]=='\n'){
                char []line_delimiter = {'l','i','n','e',' ','d','e','l','i','m','i','t','e','r','\0'};
                char [] key_word = {'\n','\0'};
                Entry <char [],char []> item = new Entry<>(key_word,line_delimiter);
                tokens.insert(item, number_of_line);
                number_of_line++;//
            }else if(words[pointer]=='\t'){
                
            }else if(words[pointer]=='#'){
                char []line_delimiter = {'l','i','n','e',' ','d','e','l','i','m','i','t','e','r','\0'};
                char [] key_word = {'#','\0'};
                Entry <char [],char []> item = new Entry<>(key_word,line_delimiter);
                tokens.insert(item, number_of_line);
            }else if(words[pointer]==' '){
                
            }else if(words[pointer]==';'){
                char []line_delimiter = {'l','i','n','e',' ','d','e','l','i','m','i','t','e','r','\0'};
                char [] key_word = {';','\0'};
                Entry <char [],char []> new_item = new Entry<>(key_word,line_delimiter);
                tokens.insert(new_item, number_of_line);
            }

            }
        pointer++;   

        }
        //System.out.println(tokens.Size());
        return this.tokens;
    }
    
    public Entry<char[],char[]> Search_For_Key_Word(char[] word){
        for(int index = 0;index<this.resrverd_words.Size();index++){
               if(this.resrverd_words.Get_value(word)!=null){
                   return this.resrverd_words.Get_value(word);
            }
        }
        
        return null;
    }
    public Entry<char [],char[]> Search_in_transtion_table(char word[]){
        int iterator =0;
        int state = 1;
        //int current_state;
       // System.out.println(word);
       do{
           //System.out.println(word[iterator]);
           if(word[iterator]>='0'&&word[iterator]<='9'){
               state = transtion_table[state][24];
           }
           else if((word[iterator]>='a' && word[iterator]<='z') || (word[iterator] >= 'A' && word[iterator]<='Z') || word[iterator]=='_'){
                //System.out.println(word[iterator]);
                state = transtion_table[state][25];  
            }
            else{

                switch (word[iterator]){
                       case '+':
                       state = transtion_table[state][1];
                       break;

                       case '-':
                       state = transtion_table[state][4]; 
                       break;

                       case '*':
                       state = transtion_table[state][2];
                       break;

                       case '/':
                       state = transtion_table[state][3];
                       break;

                       case '>':
                       state = transtion_table[state][5];
                       break;

                       case '&':
                       state = transtion_table[state][6];
                       break;

                       case '|':
                       state = transtion_table[state][7];
                       break;

                       case '~':
                       state = transtion_table[state][8];
                       break;

                       case '<':
                       state = transtion_table[state][9];
                       break;
                       case '!':
                       state = transtion_table[state][10];
                       break;

                       case '=':
                       state = transtion_table[state][11];
                       break;

                       case '{':
                       state = transtion_table[state][12];
                       break;

                       case '}':
                       state = transtion_table[state][13];

                       case '[':
                       state = transtion_table[state][14];

                       case ']':
                       state = transtion_table[state][15];
                       break;

                       case '"':
                       state = transtion_table[state][16];
                       case '\'':
                       state = transtion_table[state][17];
                       break;

                       case ',':
                       state = transtion_table[state][18];
                       break;

                       case '#':
                       state = transtion_table[state][19];
                       break;

                       case '\n':
                       state = transtion_table[state][20];
                       break;

                       case ' ':
                       state = transtion_table[state][21];  
                       break;

                       case '\t':
                       state = transtion_table[state][22];
                       break;

                       case '.':
                       state = transtion_table[state][23];       
                       break;

                       case '(':
                       state = transtion_table[state][26];
                       break;

                       case ')':
                       state = transtion_table[state][27];
                       break;

                       case ';':
                       state = transtion_table[state][28];
                       break;

                       default:
                       state=0;
                   }
  
           }
           iterator++;
            //System.out.println("a");
       }while(iterator<Char_array_util.len(word)&&error(state)==1);
        if(state==0||error(state)==0){
            //System.out.println("error");
        Entry <char[],char []>error = new Entry<>();
        error.set_key(word);
        char val[] = {'e','r','r','o','r','\0'};
        error.set_value(val);
        return error;
        }
        Entry <char[],char []>accept_token = new Entry<>();
        accept_token.set_key(word);
        if(token_names.Get_value(state).Value()!=null){
            accept_token.set_value(token_names.Get_value(state).Value());
        }
    return accept_token;
    }
    private int error(int state){
        if(accept_state[state]==true)
        return 1;
        
        return 0;
    }

    private void set_transtion(int [][]transtion_table) {
        transtion_table[1][1]=2;
        transtion_table[1][2]=3;
        transtion_table[1][3]=4;
        transtion_table[1][4]=5;
        transtion_table[1][5]=6;
        transtion_table[1][6]=7;
        transtion_table[1][7]=8;
        transtion_table[1][8]=9;
        transtion_table[1][9]=10;
        transtion_table[1][10]=11;
        transtion_table[1][11]=12;
        transtion_table[1][12]=13;
        transtion_table[1][13]=14;
        transtion_table[1][14]=15;
        transtion_table[1][15]=16;
        transtion_table[1][16]=17;
        transtion_table[1][17]=18;
        transtion_table[1][18]=19;
        transtion_table[1][19]=20;
        transtion_table[1][20]=21;
        transtion_table[1][24]=23;
        transtion_table[1][25]=22;
        transtion_table[1][26]=34;
        transtion_table[1][27]=34;
        transtion_table[1][28]=32;
        transtion_table[5][5]=6;
        transtion_table[5][24]=23;
        transtion_table[7][6]=26;
        transtion_table[8][7]=23;
        transtion_table[10][11]=28;
        transtion_table[11][11]=28;
        transtion_table[12][11]=28;
        transtion_table[22][25]=30;
        transtion_table[22][24]=31;
        transtion_table[23][23]=24;
        transtion_table[23][24]=25;
        transtion_table[25][24]=25;
        transtion_table[30][25]=30;
        transtion_table[30][25]=30;
        transtion_table[16][5]=28;

    }

    private void set_token_names(Dictionray<Integer,char []> token_names) {
        char [] state = {'c','o','n','s','t','a','n','t','\0'};
        token_names.insert(23,state);
        token_names.insert(25, state);
      
        
        char [] state1 = {'I','D','\0'};
        token_names.insert(22,state);
        token_names.insert(30,state);
        token_names.insert(31,state);

    }

    private void set_accept_state(boolean [] accept_state) {
        
        accept_state[2]=true;
        accept_state[3]=true;
        accept_state[4]=true;
        accept_state[6]=true;
        accept_state[9]=true;
        accept_state[10]=true;
        accept_state[11]=true;
        accept_state[12]=true;
        accept_state[13]=true;
        accept_state[14]=true;
        accept_state[15]=true;
        accept_state[16]=true;
        accept_state[17]=true;
        accept_state[18]=true;
        accept_state[19]=true;
        accept_state[20]=true;
        accept_state[22]=true;
        accept_state[23]=true;
        accept_state[25]=true;
        accept_state[26]=true;
        accept_state[27]=true;
        accept_state[28]=true;
        accept_state[29]=true;
        accept_state[30]=true;
        accept_state[31]=true;
        accept_state[32]=true;
        accept_state[33]=true;
        accept_state[34]=true;
        accept_state[35]=true;

        
    }


   
}
