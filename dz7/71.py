my = 'Напишите абв напиабв програбвмму программу, удаляющую из \
    этого абв текста все вабвс слова, содерабващие содержащие "абв"'

def del_some_words(my):
    my = list(filter(lambda x: 'абв' not in x, my.split()))
    return " ".join(my)

my = del_some_words(my)
print(my)