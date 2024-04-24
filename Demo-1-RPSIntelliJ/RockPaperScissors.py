# Create a rock paper scissors game
# 1. ask user to input rock paper or scissors
# 2. have the computer delect a random choice
# 3. compare the user's choice to the computer's choice\
# 4. determine the winner
# 5. ask the winner to play again

import random

def rock_paper_scissors():
    # ask user to input rock paper or scissors
    user_choice = input('Rock, paper, or scissors? ')

    # have the computer delect a random choice
    computer_choices = ['rock', 'paper', 'scissors']
    computer_choice = random.choice(computer_choices)
    # add a condition to validate if the user input is valid
    if user_choice not in computer_choices:
        print('Invalid input. Please choose rock, paper, or scissors.')
        rock_paper_scissors()

    # compare the user's choice to the computer's choice
    if user_choice == computer_choice:
        print(f'You chose {user_choice} and the computer chose {computer_choice}. It\'s a tie!')
    elif user_choice == 'rock' and computer_choice == 'scissors':
        print(f'You chose {user_choice} and the computer chose {computer_choice}. You win!')
    elif user_choice == 'paper' and computer_choice == 'rock':
        print(f'You chose {user_choice} and the computer chose {computer_choice}. You win!')
    elif user_choice == 'scissors' and computer_choice == 'paper':
        print(f'You chose {user_choice} and the computer chose {computer_choice}. You win!')
    else:
        print(f'You chose {user_choice} and the computer chose {computer_choice}. You lose!')

    # ask the winner to play again
    play_again = input('Do you want to play again? (yes or no) ')
    if play_again == 'yes':
        rock_paper_scissors()
    else:
        print('Thanks for playing!')

try:
    rock_paper_scissors()
except KeyboardInterrupt:
    print('\nGame ended by user.')
