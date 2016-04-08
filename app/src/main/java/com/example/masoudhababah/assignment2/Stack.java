package com.example.masoudhababah.assignment2;


import java.util.StringTokenizer;

/**
 * Created by masoudhababah on 04/04/2016.
 */

public class Stack {

    private Node Top;
    private int size=0;
    private Node temp;

    public Stack()
    {
    }


    public String top()
    {
        if(size==0)
            return null;
        else
            return Top.data;
    }


    public void push(String data)
    {
        Node node = new Node(data);
        node.next=Top;
        Top=node;
        size++;
    }
    public String pop()
    {
        if(size==0)
            return null;

        else
        {
            temp=Top;
            Top=Top.next;
        }
        size--;
        return temp.data;

    }


    public  boolean isEmpty()
    {
        if(size==0)
            return true;
        else
            return false;
    }

    public boolean check(String s)
    {
        int left  = 0,right= 0;
        if(s.charAt(0)=='+' || s.charAt(0)=='*' || s.charAt(0)=='/' || s.charAt(0)=='.' || s.charAt(s.length()-1)=='+' || s.charAt(s.length()-1)=='-' || s.charAt(s.length()-1)=='*' || s.charAt(s.length()-1)=='/' || s.charAt(s.length()-1)=='.')
            return false;

        if(s.charAt(0)=='-' && s.charAt(1)=='-')
            return false ;




        for(int i=0 ; i<s.length() ; i++)
        {

            if(!(Character.isDigit(s.charAt(i)) || s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/' || s.charAt(i)=='.' || s.charAt(i)=='(' || s.charAt(i)==')' ))
                return false;

            if(i != s.length()-1)
                if((s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/' || s.charAt(i)=='.') && (s.charAt(i+1)=='+' || s.charAt(i+1)=='*' || s.charAt(i+1)=='/' || s.charAt(i+1)=='.'))
                    return false;

            if(i != 0)
                if(s.charAt(i)==')' && (s.charAt(i-1)=='+' || s.charAt(i-1)=='-' || s.charAt(i-1)=='*' || s.charAt(i-1)=='/' || s.charAt(i-1)=='.'))
                    return false ;

            if(i!=0)
                if(s.charAt(i)=='(' && Character.isDigit(s.charAt(i-1)))
                    return false ;

            if(i>1)
                if(s.charAt(i)=='-' && s.charAt(i-1)=='-' && s.charAt(i-2)=='-')
                    return false ;

            if(s.charAt(i)=='(')
                right++ ;

            if(s.charAt(i)==')')
                left++ ;


            if(left == 1 && right == 0)
                return false;
        }

        if(right != left)
            return false ;


        return true ;
    }
    public  String changeFromInfixToPostfi(String s)
    {
        Stack stack=new Stack();
        String postfix="";
        for(int i=0 ; i<s.length() ; i++)
        {
            if(Character.isDigit(s.charAt(i)))
                postfix+=s.charAt(i);
            else
            {	postfix+=",";
                if(stack.isEmpty())
                    stack.push(s.charAt(i)+"");
                else
                {		while(!stack.isEmpty())
                {
                    if(!checkstackTop(stack.top() , s.charAt(i)+""))

                    {
                        stack.push(s.charAt(i)+"");
                        break;
                    }

                    else
                    {
                        postfix+=stack.pop()+",";
                        if(stack.isEmpty())
                        {
                            stack.push(s.charAt(i)+"");
                            break;

                        }
                    }
                }
                }
            }

        }
        while(!stack.isEmpty())
            postfix+=","+stack.pop();
        return postfix;
    }
    public  boolean checkstackTop(String top , String schar)
    {
        if((top.equals("*") || top.equals("/")) && (schar.equals("+") || schar.equals("-")))
            return true ;
        else if((top.equals("+") || top.equals("-")) && (schar.equals("+") || schar.equals("-")))
            return true ;
        else if(top.equals("(") && schar.equals(")"))
            return true ;
        else if(top.equals("(") && schar.equals("("))
            return true ;
        else if((top.equals("*") || top.equals("/")) && (schar.equals("*") || schar.equals("/")))
            return true ;

        else if((top.equals("+") || top.equals("-") || top.equals("*") || top.equals("/")) && schar.equals(")") )
            return true ;
        return false ;

    }



    public String toResult(String s)
    {
        Stack stack=new Stack();
        StringTokenizer tokens = new StringTokenizer(s,",");
        while(tokens.hasMoreTokens())
        {     String token = tokens.nextToken();
            if(Character.isDigit(token.charAt(0)))
                stack.push(token);
            else
            {
                if(token.charAt(0)=='+')
                {
                    stack.push((Double.parseDouble(stack.pop())+Double.parseDouble(stack.pop()))+"");
                }

                else if(token.charAt(0)=='-')
                {
                    double temp = Double.parseDouble(stack.top());
                    stack.pop();
                    stack.push((Double.parseDouble(stack.pop())-temp)+"");

                }

                else if(token.charAt(0)=='*')
                {
                    stack.push((Double.parseDouble(stack.pop())*Double.parseDouble(stack.pop()))+"");
                }

                else if(token.charAt(0)=='/')
                {
                    double temp = Double.parseDouble(stack.top());
                    stack.pop();
                    stack.push((Double.parseDouble(stack.pop())/temp)+"");
                }
                else
                    continue;
            }
        }

        return stack.pop();
    }



}

