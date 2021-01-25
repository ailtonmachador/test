This program is the first one on my course, computer science 1º year.


Java-based Lottery Game

Write a lottery game using Java. 
Normally we would ask the user for input prior to generating the winning numbers, however to make testing easier we will do things in the reverse order: first we will show the winning numbers and only then ask the user to play.

    1. When the game starts the game should generate 10 numbers between 1 and 99. For consistency if a single digit number is generated, it should be displayed with a zero to the left from the digit. For example, winning numbers may look like this:
23 09 43 78 12 35 38 04 28 88
The same number should not appear more than once.
The program should calculate the sum of the winning numbers and display it on the next line.
20 marks

    2. As a bonus game, the program should then display four prize sums, which the user can win in addition to the lottery winning. If the same sum appears more than once, the user wins that sum. The sums are: €10 (50% chance), €20(27% chance), €50(15% chance), €200(6% chance) and €1000(2% chance).
20 marks

    3. The user is then asked to enter 5 numbers one after another. If the user enters a number that he/she entered already, the program should ignore it and ask for the number again. The user is also asked to guess what the sum of all ten winning numbers will be.
10 marks

    4. There are 3 ways the user’s input is analysed in order to determine how much they won. First way. The program checks how many numbers out of the winning 10 the user guessed correctly. One is €1000, two is €6000, three is €25,000, four is €100,000 and five is €800,000. The order is not important.
15 marks

    5. The program checks if the user guessed any sequences. A sequence must include two or more numbers and must not have gaps. For example, if the program had the following winning numbers:
23 56 67 06 43 22 59 24 90 66 and user entered: 01 06 43 22 89
Then the user correctly guessed a three-number sequence. A two-number sequence wins €70,000, a three-number sequence is €400,000, a four-number sequence is €1,000,000 and all five in the correct order is €5,000,000. If the user guessed multiple sequences, only the one with the highest winning counts.
15 marks

    6. Third way. If the user correctly guessed the sum of all winning numbers, they win €300,000.
5 marks

    7. If the user won using more than one of the above methods, only the one with the highest prize sum will count. Anything won in the bonus game should be added to the lottery winnings. The game’s output should clearly describe how the total prize was calculated and which numbers won.
5 marks

There are marks for correct indentation
5 marks

Good variable names and comments.
5 marks

