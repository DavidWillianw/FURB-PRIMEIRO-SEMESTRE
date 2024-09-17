import pygame
import random
import time

# Inicializando o pygame
pygame.init()

# Definindo algumas cores
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)

# Definindo o tamanho das cartas
CARD_WIDTH = 100
CARD_HEIGHT = 150
CARD_MARGIN = 10

# Calculando o tamanho do tabuleiro baseado no tamanho das cartas e do espaçamento
NUM_ROWS = 4
NUM_COLS = 4
SCREEN_WIDTH = NUM_COLS * (CARD_WIDTH + CARD_MARGIN) + CARD_MARGIN
SCREEN_HEIGHT = NUM_ROWS * (CARD_HEIGHT + CARD_MARGIN) + CARD_MARGIN

# Configurando a tela
screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
pygame.display.set_caption('Jogo de Memória')

# Carregando e redimensionando as imagens das cartas
try:
    card_images = [pygame.transform.scale(pygame.image.load(f'images/card{i}.png'), (CARD_WIDTH, CARD_HEIGHT)) for i in range(1, 9)]
    card_back = pygame.transform.scale(pygame.image.load('images/card_back.png'), (CARD_WIDTH, CARD_HEIGHT))
except pygame.error as e:
    print(f"Erro ao carregar imagem: {e}")
    pygame.quit()
    raise SystemExit

# Duplicando e embaralhando as cartas
cards = card_images * 2
random.shuffle(cards)

# Criando uma matriz para representar o tabuleiro
board = []
for i in range(NUM_ROWS):
    row = []
    for j in range(NUM_COLS):
        row.append(cards.pop())
    board.append(row)

# Variáveis de controle do jogo
first_card = None
second_card = None
revealed_cards = []
pairs_found = 0

# Função para desenhar o tabuleiro
def draw_board():
    screen.fill(WHITE)
    for i in range(NUM_ROWS):
        for j in range(NUM_COLS):
            card = board[i][j]
            x = j * (CARD_WIDTH + CARD_MARGIN) + CARD_MARGIN
            y = i * (CARD_HEIGHT + CARD_MARGIN) + CARD_MARGIN
            if (i, j) in revealed_cards or (i, j) == first_card or (i, j) == second_card:
                screen.blit(card, (x, y))
            else:
                screen.blit(card_back, (x, y))
    pygame.display.flip()

# Função principal do jogo
def main():
    global first_card, second_card, revealed_cards, pairs_found
    clock = pygame.time.Clock()
    running = True

    while running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False
            elif event.type == pygame.MOUSEBUTTONDOWN:
                x, y = event.pos
                col = x // (CARD_WIDTH + CARD_MARGIN)
                row = y // (CARD_HEIGHT + CARD_MARGIN)
                if row < NUM_ROWS and col < NUM_COLS and (row, col) not in revealed_cards:
                    if not first_card:
                        first_card = (row, col)
                    elif not second_card:
                        second_card = (row, col)
                        draw_board()  # Mostra as cartas viradas antes de pausar
                        if board[first_card[0]][first_card[1]] == board[second_card[0]][second_card[1]]:
                            revealed_cards.append(first_card)
                            revealed_cards.append(second_card)
                            pairs_found += 1
                            if pairs_found == 8:
                                print("Você encontrou todos os pares!")
                        else:
                            pygame.display.flip()
                            time.sleep(1)  # Pausa para mostrar as cartas antes de escondê-las novamente
                        first_card = None
                        second_card = None

        draw_board()
        clock.tick(30)

    pygame.quit()

if __name__ == "__main__":
    main()
