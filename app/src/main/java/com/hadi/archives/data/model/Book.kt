package com.hadi.archives.data.model

data class Book(
    val authors: List<String> = emptyList(),
    val categories: List<String> = emptyList(),
    val longDescription: String = "",
    val shortDescription: String = "",
    val thumbnailUrl: String = "",
    val title: String = ""
)

fun getRecommendedBooks() = listOf<Book>(
    Book(
        authors = listOf("Roy Osherove"),
        categories = listOf("Programming"),
        longDescription = "A guide for UNIX developers who want accurate information on getting up to speed with Mac OS X and its software development environment, this book provides programmers all the information they need to understand and use the operating system, its development tools, and key technologies such as Darwin, Cocoa and AppleScript.    Users are introduced to the UNIX-based foundations of Mac OS X and shown how they fit into Mac OS X architecture. Also provided is coverage of both GUI and command-line software development tools, realistic programming examples that developers will encounter, and a discussion of Macintosh-style software development.",
        shortDescription = "\"...an effective guide for Unix developers who want accurate information specifically on getting up to speed with Mac OS X and its software development environment, without having to sort through the morass of online information overload. ...If you've been a little skittish about Interface Builder, forget your worries now because the tutorial in the book is very good. ...The projects and examples are thorough and should provide even the most jaded intermediate programmer with a real taste of how challenging and satisfying it can be to code for OSX.\" - KickStartNews.com",
        thumbnailUrl = "https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/omalley.jpg",
        title = "Programming Mac OS X"
    ),
    Book(
        authors = listOf("Jeffrey Palermo", "Ben Scheirman", "Jimmy Bogard"),
        categories = listOf("Microsoft .NET"),
        longDescription = "ASP.NET MVC implements the Model-View-Controller pattern on the ASP.NET runtime. It works well with open source projects like NHibernate, Castle, StructureMap, AutoMapper, and MvcContrib.    ASP.NET MVC in Action is a guide to pragmatic MVC-based web development. After a thorough overview, it dives into issues of architecture and maintainability. The book assumes basic knowledge of ASP.NET (v. 3.5) and expands your expertise. Some of the topics covered:        * How to effectively perform unit and full-system tests.      * How to implement dependency injection using StructureMap or Windsor.      * How to work with the domain and presentation models.      * How to work with persistence layers like NHibernate.    The book's many examples are in C#.",
        shortDescription = "ASP.NET MVC in Action is a guide to pragmatic MVC-based web development. After a thorough overview, it dives into issues of architecture and maintainability. The book assumes basic knowledge of ASP.NET (v. 3.5) and expands your expertise.",
        thumbnailUrl = "https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/palermo.jpg",
        title = "ASP.NET MVC in Action"
    ),
    Book(
        authors = listOf("Tomas Petricek", "Jon Skeet"),
        categories = listOf("Programming"),
        longDescription = "Functional programming languages are good at expressing complex ideas in a succinct, declarative way. Functional concepts such as \"immutability\" and \"function values\" make it easier to reason about code   as well as helping with concurrency. The new F# language, LINQ, certain new features of C#, and numerous .NET libraries now bring the power of functional programming to .NET coders.    This book teaches the ideas and techniques of functional programming applied to real-world problems. You'll see how the functional way of thinking changes the game for .NET developers. Then, you'll tackle common issues using a functional approach. The book will also teach you the basics of the F# language and extend your C# skills into the functional domain. No prior experience with functional programming or F# is required.    WHAT'S INSIDE:        * Thinking the functional way      * Blending OO and functional programming      * Effective F# code",
        shortDescription = "This book teaches the ideas and techniques of functional programming applied to real-world problems. You'll see how the functional way of thinking changes the game for .NET developers. Then, you'll tackle common issues using a functional approach. The book will also teach you the basics of the F# language and extend your C# skills into the functional domain. No prior experience with functional programming or F# is required.",
        thumbnailUrl = "https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/petricek.jpg",
        title = "Real-World Functional Programming"
    ),
    Book(
        authors = listOf("Dhanji R. Prasanna"),
        categories = listOf("Programming"),
        shortDescription = "   If you do large scale java apps, you probably want to have someone on the team have this book.       Michael Neale",
        longDescription = "In object-oriented programming, a central program normally controls other objects in a module, library, or framework. With dependency injection, this pattern is inverted   a reference to a service is placed directly into the object which eases testing and modularity. Spring or Google Guice use dependency injection so you can focus on your core application and let the framework handle infrastructural concerns.    Dependency Injection explores the DI idiom in fine detail, with numerous practical examples that show you the payoffs. You'll apply key techniques in Spring and Guice and learn important pitfalls, corner-cases, and design patterns. Readers need a working knowledge of Java but no prior experience with DI is assumed.",
        thumbnailUrl = "https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/prasanna.jpg",
        title = "Dependency Injection"
    ),
    Book(
        authors = listOf("Trygve Reenskaug"),
        categories = listOf("Object-Oriented Programming"),
        shortDescription = "\"The first method that deals realistically with reuse, and one of the few that comes close to describing what I do when I design.\" --Ralph Johnson, University of Illinois",
        longDescription = "Working With Objects is the authoritative account of the highly successful OOram method for software analysis, design, development, maintenance and reuse. OOram has been fine-tuned over a decade on hundreds of projects by Trygve Reenskaug and his collaborators. It is supported by available CASE tools, training, and consulting.    Working With Objects is the source on a method which takes an evolutionary step forward in object-oriented development practices. OOram adds the intuitively simple but powerful concept of a role to object-oriented models and methods. For example, imagine trying to describe a person as an object. The most effective way to do this would be to independently describe each of the roles that person adopts (parent, employee, and so on) and then define how the person supports them. These ideas form the heart of the OOram approach.    In a presentation rich with examples, Working With Objects is anything but the typical, dry methodology book. It tells real-life stories. It teaches how to apply role modeling and benefit from its inherent advantages, including:    Multiple views of the same model  Support for both data- and process-centered approaches  Large systems described through a number of distinct models  Derivation of composite models from simpler, base models  Decentralized management of very large systems  Programming language-independent design  Step-by-step transformation of models into implementations  Integration of powerful reuse techniques with work policies, processes and organization",
        thumbnailUrl = "https://s3.amazonaws.com/AKIAJC5RLADLUMVRPFDQ.book-thumb-images/reenskaug.jpg",
        title = "Working with Objects",
    ),
)