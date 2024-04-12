# import sys
# print('///' + os.getcwd())
# print(os.path)
# sys.path.insert(1, os.getcwd())

from app import make_app
from spaceship.config import Settings

app = make_app(Settings())
