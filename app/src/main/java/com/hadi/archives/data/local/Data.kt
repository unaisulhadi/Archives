package com.hadi.archives.data.local

import com.hadi.archives.R
import com.hadi.archives.data.model.Book
import com.hadi.archives.data.model.Slider

fun getAllBooks() = listOf<Book>(
    Book(
        id = "the_psychology_of_money",
        title = "The Psychology of Money",
        author = "Morgan Housel",
        description = "Timeless lessons on wealth, greed, and happiness doing well with money isn?t necessarily about what you know. It?s about how you behave. And behavior is hard to teach, even to really smart people. How to manage money, invest it, and make business decisions are typically considered to involve a lot of mathematical calculations, where data and formulae tell us exactly what to do. But in the real world, people don?t make financial decisions on a spreadsheet. They make them at the dinner table, or in a meeting room, where personal history, your unique view of the world, ego, pride, marketing, and odd incentives are scrambled together. In the psychology of money, the author shares 19 short stories exploring the strange ways people think about money and teaches you how to make better sense of one of life?s most important matters.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/71g2ednj0JL.jpg",
        pageCount = 252,
        language = "English",
        rating = 4.6,
        publisher = "Jaico Publishing House",
        category = "Life"
    ),
    Book(
        id = "the_right_choice",
        title = "The Right Choice",
        author = "Shiv Shivakumar",
        description = "Should money be the primary factor in picking a job? When do I pursue an MBA or a second MBA? Should I switch industries to move ahead?\n" + "The Right Choice delves deep into the ten frequently faced dilemmas in a person's career, such as the ones listed above. The author shares his wisdom and experiences from his illustrious career as one of India Inc's longest-serving CEOs. In his trademark straightforward and lucid style, he shares lessons and learnings on each of the ten dilemmas. The book also contains insights and perspectives from twenty-four highly experienced professionals.\n" + "A successful career is not a straight line; it has many twists and turns where you are faced with difficult choices. Practical and inspiring, The Right Choiceis a must read corporate management book and a career guide that will help you navigate these difficult situations-and win in your career.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/71+MYOme7zL.jpg",
        pageCount = 240,
        language = "English",
        rating = 4.8,
        publisher = "Penguin Portfolio",
        category = "Life"
    ),
    Book(
        id = "the_atomic_habits",
        title = "Atomic Habits",
        author = "James Clear",
        description = "‘A supremely practical and useful book. James Clear distils the most fundamental information about habit formation, so you can accomplish more by focusing on less. ’ Mark Manson, author of The Subtle Art of Not Giving A F*ck________________________________People say when you want to change your life, you need to set big goals. But they’re wrong. World-renowned habits expert James Clear has discovered a simpler system for transforming your life. He knows that lasting change comes from the compound effect of hundreds of small decisions – doing two push-ups a day, waking up five minutes early, or holding a single short phone call. He calls them atomic habits. In this ground-breaking book, Clear reveals how these tiny changes will help you get 1 percent better every day. He uncovers a handful of simple life hacks (the forgotten art of Habit Stacking, the unexpected power of the Two Minute Rule, or the trick to entering the Goldilocks Zone) and delves into cutting-edge psychology and neuroscience to explain why they matter. Along the way, he tells inspiring stories of Olympic gold medalists, leading CEOs and distinguished scientists who have used the science of small habits to stay productive, motivated and happy. These small changes will have a revolutionary effect on your career, your relationships and your life. ________________________________‘James Clear has spent years honing the art and studying the science of habits. This engaging, hands-on book is the guide you need to break bad routines and make good ones. ’ Adam Grant, author of Originals‘A special book that will change how you approach your day and live your life. ’ Ryan Holiday, author of The Obstacle is the Way",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/91bYsX41DVL.jpg",
        pageCount = 288,
        language = "English",
        rating = 4.8,
        publisher = "Random House Business Books",
        category = "Life"
    ),
    Book(
        id = "the_subtle_art_of_not_giving_a_f*ck",
        title = "The Subtle Art of Not Giving a F*ck",
        author = "Mark Manson",
        description = "In this generation-defining self-help guide, a superstar blogger cuts through the crap to show us how to stop trying to be “positive” all the time so that we can truly become better, happier people\n" + "For decades, we’ve been told that positive thinking is the key to a happy, rich life. “Fuck positivity,” Mark Manson says. “Let’s be honest, shit is fucked and we have to live with it.” In his wildly popular Internet blog, Manson doesn’t sugar-coat or equivocate. He tells it like it is—a dose of raw, refreshing, honest truth that is sorely lacking today. The Subtle Art of Not Giving a F**k is his antidote to the coddling, let’s-all-feel-good mind-set that has infected\n" + "American society and spoiled a generation, rewarding them with gold medals just for showing up.\n" + "Manson makes the argument, backed both by academic research and well-timed poop jokes, that improving our lives hinges not on our ability to turn lemons into lemonade, but on learning to stomach lemons better. Human beings are flawed and limited—“not everybody can be extraordinary, there are winners and losers in society and some of it is not fair or your fault.” Manson advises us to get to know our limitations and accept them. Once we embrace\n" + "our fears, faults and uncertainties, once we stop running and avoiding and start confronting painful truths, we can begin to find the courage, perseverance, honesty, responsibility, curiosity and forgiveness we seek.\n" + "There are only so many things we can give a fuck about so we need to figure out which ones really matter, Manson makes clear. While money is nice, caring about what you do with your life is better, because true wealth is about experience.\n" + "A much-needed grab-you-by-the-shoulders-and-look-you-in the-eye moment of real talk, filled with entertaining stories and profane, ruthless humor, The Subtle Art of Not Giving a F**k is a refreshing slap for a generation to help them truly lead contented, grounded lives.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/814jC+rODgL.jpg",
        pageCount = 224,
        language = "English",
        rating = 4.8,
        publisher = "Harper Collins",
        category = "Life"
    ),
    Book(
        id = "the_time_machine",
        title = "The Time Machine",
        author = "H. G. Wells",
        description = "A compelling science fiction, the Time Machine is a first-hand account of a Time Traveler's journey into the future. a pull of the lever and the machine sends him to the year 802,701, when humanity has split into two bizarre races?the ethereal Eloi and the subterranean Morlocks. Here, his machine is stolen and with the help of Weena, an Eloi he saved from drowning, the traveler is able to retrieve it. Whizzing thirty million years further into the future, he finds a slowly dying earth, where the bloated red sun sits motionless in the sky and the only sign of life is a black blob with tentacles.He returns to the Victorian time, overwhelmed, just three hours after he originally left..Credited with inventing the time machine in this masterpiece, the provocative insight of H. G. Wells continues to enthrall the readers. the Time Machine has since been adapted into many feature films and television series and has inspired many more works of fiction.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/51WLfY9mc5L.jpg",
        pageCount = 144,
        language = "English",
        rating = 4.7,
        publisher = "Fingerprint! Publishing",
        category = "Science Fiction"
    ),
    Book(
        id = "red_world",
        title = "Red World - The Genesis",
        author = "Upasana Majumdar",
        description = "Red World - The Genesis explores the inception of civilization on the red planet Mars. An intriguing tale that brilliantly navigates the layered realms of human emotions against the backdrop of the first Martian society. Narrated by relatable characters and driven by fantastic innovations in a futuristic society, this gripping story explores the motivation for a new home planet, and what happens when all does not go as planned. Science has catalyzed the evolution of human society, but it has also promoted inequality and exploitation through systemic biases and discrimination across countries and cultures...\nWill this new Red World be able to beat Martian hostilities to achieve a functional society? Or will the settlers succumb to the same social pitfalls that have plagued human lives for centuries? Hop onto this fast-paced journey into a futuristic world to find out...",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/61gnnwNOxfL.jpg",
        pageCount = 120,
        language = "English",
        rating = 4.4,
        publisher = "White Falcon Publishing",
        category = "Fiction"
    ),
    Book(
        id = "the_martian",
        title = "The Martian",
        author = "Andy Weir",
        description = "I'm stranded on Mars.\n" + "I have no way to communicate with Earth.\n" + "I'm in a habitat designed to last 31 days.\n" + "If the oxygenator breaks down, I'll suffocate. If the water reclaimer breaks down, I'll die of thirst. If the hab breaches, I'll just kind of explode. If none of those things happen, I'll eventually run out of food and starve to death.\n" + "So yeah. I'm screwed.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/81V3ODP5MJL.jpg",
        pageCount = 125,
        language = "English",
        rating = 4.7,
        publisher = "Leadstart Publishing Pvt Ltd",
        category = "Science"
    ),
    Book(
        id = "black_holes",
        title = "Black Holes: The Reith Lectures",
        author = "Stephen Hawking",
        description = "?It is said that fact is sometimes stranger than fiction, and nowhere is that more true than in the case of black holes. Black holes are stranger than anything dreamed up by science fiction writers.?In 2016 Professor Stephen Hawking delivered the BBC Reith Lectures on a subject that fascinated him for decades ? black holes.In these flagship lectures the legendary physicist argued that if we could only understand black holes and how they challenge the very nature of space and time, we could unlock the secrets of the universe.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/91V2mnP754L.jpg",
        pageCount = 80,
        language = "English",
        rating = 4.8,
        publisher = "Bantam",
        category = "Science Fiction"
    ),
    Book(
        id = "the_art_of_management",
        title = "The Art of Management",
        author = "Shiv Shivakumar",
        description = "Careers are changing, and the capabilities required to stay relevant are changing even more rapidly. We seem to have endless choices, at least at the beginning of a career, but these start narrowing after middle management. How does one think about one's own life and career in this changing decade?\n" + "The whole discipline of career management now has three elements to it:\n" + "Managing yourself;\n" + "Managing your team; and\n" + "Managing your business\n" + "In this book, Shiv Shivakumar points out that today, unlike in the past, all the three elements are your responsibility. With in-depth interviews with top leaders across the spectrum and an insightful foreword by Sachin Tendulkar, The Art of Management is a must-read.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/51YVZwbnrTL.jpg",
        pageCount = 288,
        language = "English",
        rating = 4.8,
        publisher = "Penguin Portfolio",
        category = "Management"
    )
)

fun getManagementBooks() = listOf<Book>(
    Book(
        id = "the_psychology_of_money",
        title = "The Psychology of Money",
        author = "Morgan Housel",
        description = "Timeless lessons on wealth, greed, and happiness doing well with money isn?t necessarily about what you know. It?s about how you behave. And behavior is hard to teach, even to really smart people. How to manage money, invest it, and make business decisions are typically considered to involve a lot of mathematical calculations, where data and formulae tell us exactly what to do. But in the real world, people don?t make financial decisions on a spreadsheet. They make them at the dinner table, or in a meeting room, where personal history, your unique view of the world, ego, pride, marketing, and odd incentives are scrambled together. In the psychology of money, the author shares 19 short stories exploring the strange ways people think about money and teaches you how to make better sense of one of life?s most important matters.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/71g2ednj0JL.jpg",
        pageCount = 252,
        language = "English",
        rating = 4.6,
        publisher = "Jaico Publishing House",
        category = "Life"
    ),
    Book(
        id = "the_right_choice",
        title = "The Right Choice",
        author = "Shiv Shivakumar",
        description = "Should money be the primary factor in picking a job? When do I pursue an MBA or a second MBA? Should I switch industries to move ahead?\n" + "The Right Choice delves deep into the ten frequently faced dilemmas in a person's career, such as the ones listed above. The author shares his wisdom and experiences from his illustrious career as one of India Inc's longest-serving CEOs. In his trademark straightforward and lucid style, he shares lessons and learnings on each of the ten dilemmas. The book also contains insights and perspectives from twenty-four highly experienced professionals.\n" + "A successful career is not a straight line; it has many twists and turns where you are faced with difficult choices. Practical and inspiring, The Right Choiceis a must read corporate management book and a career guide that will help you navigate these difficult situations-and win in your career.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/71+MYOme7zL.jpg",
        pageCount = 240,
        language = "English",
        rating = 4.8,
        publisher = "Penguin Portfolio",
        category = "Life"
    ),
    Book(
        id = "the_atomic_habits",
        title = "Atomic Habits",
        author = "James Clear",
        description = "‘A supremely practical and useful book. James Clear distils the most fundamental information about habit formation, so you can accomplish more by focusing on less. ’ Mark Manson, author of The Subtle Art of Not Giving A F*ck________________________________People say when you want to change your life, you need to set big goals. But they’re wrong. World-renowned habits expert James Clear has discovered a simpler system for transforming your life. He knows that lasting change comes from the compound effect of hundreds of small decisions – doing two push-ups a day, waking up five minutes early, or holding a single short phone call. He calls them atomic habits. In this ground-breaking book, Clear reveals how these tiny changes will help you get 1 percent better every day. He uncovers a handful of simple life hacks (the forgotten art of Habit Stacking, the unexpected power of the Two Minute Rule, or the trick to entering the Goldilocks Zone) and delves into cutting-edge psychology and neuroscience to explain why they matter. Along the way, he tells inspiring stories of Olympic gold medalists, leading CEOs and distinguished scientists who have used the science of small habits to stay productive, motivated and happy. These small changes will have a revolutionary effect on your career, your relationships and your life. ________________________________‘James Clear has spent years honing the art and studying the science of habits. This engaging, hands-on book is the guide you need to break bad routines and make good ones. ’ Adam Grant, author of Originals‘A special book that will change how you approach your day and live your life. ’ Ryan Holiday, author of The Obstacle is the Way",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/91bYsX41DVL.jpg",
        pageCount = 288,
        language = "English",
        rating = 4.8,
        publisher = "Random House Business Books",
        category = "Life"
    ),
    Book(
        id = "the_subtle_art_of_not_giving_a_f*ck",
        title = "The Subtle Art of Not Giving a F*ck",
        author = "Mark Manson",
        description = "In this generation-defining self-help guide, a superstar blogger cuts through the crap to show us how to stop trying to be “positive” all the time so that we can truly become better, happier people\n" + "For decades, we’ve been told that positive thinking is the key to a happy, rich life. “Fuck positivity,” Mark Manson says. “Let’s be honest, shit is fucked and we have to live with it.” In his wildly popular Internet blog, Manson doesn’t sugar-coat or equivocate. He tells it like it is—a dose of raw, refreshing, honest truth that is sorely lacking today. The Subtle Art of Not Giving a F**k is his antidote to the coddling, let’s-all-feel-good mind-set that has infected\n" + "American society and spoiled a generation, rewarding them with gold medals just for showing up.\n" + "Manson makes the argument, backed both by academic research and well-timed poop jokes, that improving our lives hinges not on our ability to turn lemons into lemonade, but on learning to stomach lemons better. Human beings are flawed and limited—“not everybody can be extraordinary, there are winners and losers in society and some of it is not fair or your fault.” Manson advises us to get to know our limitations and accept them. Once we embrace\n" + "our fears, faults and uncertainties, once we stop running and avoiding and start confronting painful truths, we can begin to find the courage, perseverance, honesty, responsibility, curiosity and forgiveness we seek.\n" + "There are only so many things we can give a fuck about so we need to figure out which ones really matter, Manson makes clear. While money is nice, caring about what you do with your life is better, because true wealth is about experience.\n" + "A much-needed grab-you-by-the-shoulders-and-look-you-in the-eye moment of real talk, filled with entertaining stories and profane, ruthless humor, The Subtle Art of Not Giving a F**k is a refreshing slap for a generation to help them truly lead contented, grounded lives.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/814jC+rODgL.jpg",
        pageCount = 224,
        language = "English",
        rating = 4.8,
        publisher = "Harper Collins",
        category = "Life"
    )

)

fun getScienceFictions() = listOf<Book>(

    Book(
        id = "the_time_machine",
        title = "The Time Machine",
        author = "H. G. Wells",
        description = "A compelling science fiction, the Time Machine is a first-hand account of a Time Traveler's journey into the future. a pull of the lever and the machine sends him to the year 802,701, when humanity has split into two bizarre races?the ethereal Eloi and the subterranean Morlocks. Here, his machine is stolen and with the help of Weena, an Eloi he saved from drowning, the traveler is able to retrieve it. Whizzing thirty million years further into the future, he finds a slowly dying earth, where the bloated red sun sits motionless in the sky and the only sign of life is a black blob with tentacles.He returns to the Victorian time, overwhelmed, just three hours after he originally left..Credited with inventing the time machine in this masterpiece, the provocative insight of H. G. Wells continues to enthrall the readers. the Time Machine has since been adapted into many feature films and television series and has inspired many more works of fiction.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/51WLfY9mc5L.jpg",
        pageCount = 144,
        language = "English",
        rating = 4.7,
        publisher = "Fingerprint! Publishing",
        category = "Science Fiction"
    ),
    Book(
        id = "red_world",
        title = "Red World - The Genesis",
        author = "Upasana Majumdar",
        description = "Red World - The Genesis explores the inception of civilization on the red planet Mars. An intriguing tale that brilliantly navigates the layered realms of human emotions against the backdrop of the first Martian society. Narrated by relatable characters and driven by fantastic innovations in a futuristic society, this gripping story explores the motivation for a new home planet, and what happens when all does not go as planned. Science has catalyzed the evolution of human society, but it has also promoted inequality and exploitation through systemic biases and discrimination across countries and cultures...\nWill this new Red World be able to beat Martian hostilities to achieve a functional society? Or will the settlers succumb to the same social pitfalls that have plagued human lives for centuries? Hop onto this fast-paced journey into a futuristic world to find out...",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/61gnnwNOxfL.jpg",
        pageCount = 120,
        language = "English",
        rating = 4.4,
        publisher = "White Falcon Publishing",
        category = "Fiction"
    ),
    Book(
        id = "the_martian",
        title = "The Martian",
        author = "Andy Weir",
        description = "I'm stranded on Mars.\n" + "I have no way to communicate with Earth.\n" + "I'm in a habitat designed to last 31 days.\n" + "If the oxygenator breaks down, I'll suffocate. If the water reclaimer breaks down, I'll die of thirst. If the hab breaches, I'll just kind of explode. If none of those things happen, I'll eventually run out of food and starve to death.\n" + "So yeah. I'm screwed.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/81V3ODP5MJL.jpg",
        pageCount = 125,
        language = "English",
        rating = 4.7,
        publisher = "Leadstart Publishing Pvt Ltd",
        category = "Science"
    ),
    Book(
        id = "black_holes",
        title = "Black Holes: The Reith Lectures",
        author = "Stephen Hawking",
        description = "?It is said that fact is sometimes stranger than fiction, and nowhere is that more true than in the case of black holes. Black holes are stranger than anything dreamed up by science fiction writers.?In 2016 Professor Stephen Hawking delivered the BBC Reith Lectures on a subject that fascinated him for decades ? black holes.In these flagship lectures the legendary physicist argued that if we could only understand black holes and how they challenge the very nature of space and time, we could unlock the secrets of the universe.",
        imageUrl = "https://images-na.ssl-images-amazon.com/images/I/91V2mnP754L.jpg",
        pageCount = 80,
        language = "English",
        rating = 4.8,
        publisher = "Bantam",
        category = "Science Fiction"
    )
)

fun getRecentRead() = Book(
    id = "the_art_of_management",
    title = "The Art of Management",
    author = "Shiv Shivakumar",
    description = "Careers are changing, and the capabilities required to stay relevant are changing even more rapidly. We seem to have endless choices, at least at the beginning of a career, but these start narrowing after middle management. How does one think about one's own life and career in this changing decade?\n" + "The whole discipline of career management now has three elements to it:\n" + "Managing yourself;\n" + "Managing your team; and\n" + "Managing your business\n" + "In this book, Shiv Shivakumar points out that today, unlike in the past, all the three elements are your responsibility. With in-depth interviews with top leaders across the spectrum and an insightful foreword by Sachin Tendulkar, The Art of Management is a must-read.",
    imageUrl = "https://images-na.ssl-images-amazon.com/images/I/51YVZwbnrTL.jpg",
    pageCount = 288,
    language = "English",
    rating = 4.8,
    publisher = "Penguin Portfolio",
    category = "Management"
)


object SliderData {
    val slides = listOf<Slider>(
        Slider(R.drawable.slide_1,"Sleep is good, he said, and books are better.","George R.R. Martin"),
        Slider(R.drawable.slide_3,"Books are uniquely portable magic.","Walt Disney"),
        Slider(R.drawable.slide_2,"There is no friend as loyal as a book.","Stephen King"),
    )
}
