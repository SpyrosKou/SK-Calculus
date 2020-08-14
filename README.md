# [SK Calculus](https://github.com/SpyrosKou/SK-Calculus)
SK Combinator Calculus written in Java

## SK Calculus
SK Calculus or SK Combinator Calculus is a [Turing complete](https://en.wikipedia.org/wiki/Turing_completeness) computational system, that can be regarded as a reduced version of the untyped [lambda calculus](https://en.wikipedia.org/wiki/Lambda_calculus). 
SK Combinator Calculus is also referred as SKI Combinator Calculus. In SKI Combinator Calculus, the identity (I) combinator is also included.
However, the minimum computational system is the SK. Since S and K combinators can compose I as SKK or SKS, thus rendering the I combinator optional.
[SK Calculus](https://github.com/SpyrosKou/SK-Calculus) includes an implementation of the I combinator.
SK Calculus is mentioned in [Lambda Talk](https://github.com/glebec/lambda-talk) repository, which is a very good resource for reading about lambda calculus.
Wikipedia has also some information about [SKI Combinator Calculus](https://en.wikipedia.org/wiki/SKI_combinator_calculus). 

## [SK Calculus](https://github.com/SpyrosKou/SK-Calculus) features
[SK Calculus](https://github.com/SpyrosKou/SK-Calculus) offers the following
- S and K combinators compose all other combinators
- S, K and all combinators provided are [curried](https://en.wikipedia.org/wiki/Currying). 
- Combinators allow a syntax that resembles functional programming, as well as a Java syntax.For instance after statically importing the combinators one can write:

        I //I is a term 
        I() //I() returns an I term
        I(I(I(I(I( I() ))))) //Multiple I invocations. I() returns an I.
        I(I(I(I(I( I ))))) //Using I instead of I()
        I.apply(I.apply(I.apply(I.apply(I.apply(I))))) //use [Java Function](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html).[apply](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html#apply-T-)  
        S(K).apply(K).apply(K) //Currying

- All Combinators implement the Term interface, which extends the Function<Term,Term> interface. All Combinators apply method return a Term and accept a Term.  
- Combinators can be nicely printed, by reasonably overriding the .toString() method.

        System.out.println(K(I).apply(I)); //Renders "I" Since after applying both arguments the result would be I.
        System.out.println(K(S)); //Renders "K(S)", as the second argument has not been applied yet.
        System.out.println(K(S).apply(I)); //Renders "S"
        System.out.println(K(K)); //Renders "K(K)",as the second argument has not been applied yet.

###Scope & Motivation
[SK Calculus](https://github.com/SpyrosKou/SK-Calculus) was written for experimentation and study of the SK Calculus in Java. 
The 

###About
Author: Spyros Koukas
Date: 2020-08-13