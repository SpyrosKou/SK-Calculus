# [SK Calculus](https://github.com/SpyrosKou/SK-Calculus)
SK Combinator Calculus written in Java

## SK Calculus
SK Calculus or SK Combinator Calculus is a [Turing complete](https://en.wikipedia.org/wiki/Turing_completeness) computational system, that can be regarded as a reduced version of the untyped [lambda calculus](https://en.wikipedia.org/wiki/Lambda_calculus). 
SK Calculus is the minimal turing complete system of SKI Combinator Calculus.  
In a nutshell SKI Combinator Calculus is SK Combinator Calculus with the addition of the identity (I) combinator.
S and K combinators can compose I as SKK or SKS, thus rendering the I combinator optional.
[SK Calculus](https://github.com/SpyrosKou/SK-Calculus) includes an implementation of the I combinator, which is composed of S and K.

## [SK Calculus](https://github.com/SpyrosKou/SK-Calculus) features
[SK Calculus](https://github.com/SpyrosKou/SK-Calculus) offers the following
- S and K combinators compose all other combinators
- S, K and all combinators provided are [curried](https://en.wikipedia.org/wiki/Currying). 
- Combinators allow a syntax that resembles functional programming, as well as a Java syntax.For instance after statically importing the combinators one can write:

        I //I is a term 
        I() //I() returns an I term
        I(I(I(I(I( I() ))))) //Multiple I invocations. I() returns an I.
        I(I(I(I(I( I ))))) //Using I instead of I()
        I.apply(I.apply(I.apply(I.apply(I.apply(I))))) //use Function<Term,Term>.apply(Term) in a way consistent with usual Java coding standards  
        S(K).apply(K).apply(K) //Currying, in this case the apply method needs to be used. 

- All Combinators implement the Term interface, which extends the use [Java Function<Term,Term>](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html) interface. All Combinators offer an [apply(Term)](https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html#apply-T-) method that accept a Term and return a Term.  
- Combinators can be nicely printed, by reasonably overriding the .toString() method.

        System.out.println(K(I).apply(I)); //Renders "I" Since after applying both arguments the result would be I.
        System.out.println(K(S)); //Renders "K(S)", as the second argument has not been applied yet.
        System.out.println(K(S).apply(I)); //Renders "S"
        System.out.println(K(K)); //Renders "K(K)",as the second argument has not been applied yet.

## Scope & Motivation
[SK Calculus](https://github.com/SpyrosKou/SK-Calculus) was written for experimentation and study of the SK Calculus in Java.
As SK Calculus is turing complete, it is also theoretically possible to create turing machine by using SK Calculus. Although an interesting idea, an attempt to implement a turing machine that would need to fine tune aspects of this implementation such as the stack memory usage. 
A set of video lectures, presentation and javascript demonstrations of lambda calculus , that also mention the SK Calculus, can be found here: [Lambda Talk](https://github.com/glebec/lambda-talk) .

## About
Author: Spyros Koukas
Date: 2020-08-13