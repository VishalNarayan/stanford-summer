import random
board = []
for spot in range(3):
    board.append(['+'] * 3)
def print_board(board):
    for row in board:
        print ' '.join(row)
    
def check_winner():
    if board[0][0] == board[0][1] == board[0][2] == 'X' or board[0][0] == board[0][1] == board[0][2] == 'O':
        return True
    elif board[1][0] == board[1][1] == board[1][2] == 'X' or board[1][0] == board[1][1] == board[1][2] == 'O':
        return True
    elif board[2][0] == board[2][1] == board[2][2] == 'X' or board[2][0] == board[2][1] == board[2][2] == 'O':
        return True
    elif board[0][0] == board[1][0] == board[2][0] == 'X' or board[0][0] == board[1][0] == board[2][0] == 'O':
        return True
    elif board[0][1] == board[1][1] == board[2][1] == 'X' or board[0][1] == board[1][1] == board[2][1] == 'O':
        return True
    elif board[0][2] == board[1][2] == board[2][2] == 'X' or board[0][2] == board[1][2] == board[2][2] == 'O':
        return True
    elif board[0][0] == board[1][1] == board[2][2] == 'X' or board[0][0] == board[1][1] == board[2][2] == 'O':
        return True
    elif board[0][2] == board[1][1] == board[2][0] == 'X' or board[0][2] == board[1][1] == board[2][0] == 'O':
        return True
    else:
        return False

                    
tut_board = []
tut_board.append('(0,0) (0,1) (0,2)')
tut_board.append('(1,0) (1,1) (1,2)')
tut_board.append('(2,0) (2,1) (2,2)')
print 'Welcome to Tic - Tac - Toe! Here is a little tutorial.'
for row in tut_board:
    print ''.join(row)
count = 0
while count < 5:
    user_row = int(raw_input('Choose row:'))
    user_col = int(raw_input('Choose column:'))
    while user_row not in range(0,3) or user_col not in range(0,3):
        print "Whoops! That is off the board!"
        user_row = int(raw_input('Choose row:'))
        user_col = int(raw_input('Choose column:'))
    print user_row
    print user_col
    while board[user_row][user_col] == 'X' or board[user_row][user_col] == 'O':
        print "Spot's been taken!"
        user_row = int(raw_input('Choose row:'))
        user_col = int(raw_input('Choose column:'))
    board[user_row][user_col] = 'X'
    if check_winner() == True:
        print_board(board)
        print 'Game Over'
        print 'You Win!'
        break
    if count == 4:
        print_board(board)
        print 'Draw'
        break
    
    
    random_row = random.randint(0, 2)
    random_col = random.randint(0, 2)
    print random_row
    print random_col
    while board[random_row][random_col] == 'X' or board[random_row][random_col] == 'O':
        random_row = random.randint(0, 2)
        random_col = random.randint(0, 2)
        
    board[random_row][random_col] = 'O'
    if check_winner() == True:
        print_board(board)
        print 'Game Over'
        print 'You Lose :('
        break
    print_board(board)
    count += 1
    
    
