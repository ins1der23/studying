phone_book = []
path = 'C:/repo/subjects/firs_steps_python/practice_8/phones.txt'


def open_file():
    with open(path, 'r', encoding='UTF-8') as file:
        data = file.readlines()
    for contact in data:
        user_id, name, phone, comment, *_ = contact.strip().split(':')
        phone_book.append({'id': user_id, 'name': name,
                          'phone': phone, 'comment': comment})


open_file()

new_contact = ['Введите имя контакта: ',
               'Введите телефон: ', 'Введите коммент: ']


def input_contact(message: str) -> dict[str, str]:
    print(message)
    name = input(new_contact[0])
    phone = input(new_contact[1])
    comment = input(new_contact[2])
    return {'name': name, 'phone': phone, 'comment': comment}


new = input_contact('Введите новый контакт')


def check_id():
    uid_list = []
    for contact in phone_book:
        uid_list.append(int(contact.get('id')))
    print(uid_list)
    return {'id': max(uid_list) + 1}


def add_contact(new: dict):
    new.update(check_id())
    phone_book.append(new)


add_contact(new)
print(phone_book)


def reassign_id():
    for contact in phone_book:
        contact['id'] = phone_book.index(contact) + 1


reassign_id()


def save_file():
    res = ''
    for contact in phone_book:
        res += f"{contact.get('id')}:{contact.get('name')}:{contact.get('phone')}:{contact.get('comment')}\n"
    print(res)
    with open(path, 'w', encoding='UTF-8') as file:
        file.write(res)


save_file()
