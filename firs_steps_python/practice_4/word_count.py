from string import punctuation

sentence = "i am gonna ru>le the world world rule"
for ch in punctuation:
    sentence = sentence.replace(ch, '')
count_list = set(sentence.lower().split())
print(len(count_list))