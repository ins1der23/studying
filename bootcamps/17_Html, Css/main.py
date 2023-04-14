from flask import Flask, render_template
from random import randint as rd

app = Flask(__name__)


@app.route('/')
@app.route('/index')
def main():
    with open('c:/repo/subjects/bootcamps/17_Html, Css/file.txt', 'r', encoding = 'utf8') as file:
        resultData = list()
        for line in file.readlines():
            resultData.append(tuple(line.split('\n')[0].split(';')))


    return render_template('base.html', data=resultData)

@app.route('/about')
def about():
    return render_template('about.html')

if __name__ == '__main__':
    app.run()
