FROM python:3.9

WORKDIR /home/project-python/requirements
COPY requirements/backend.in .

RUN pip install --no-cache-dir -r backend.in

WORKDIR /home/project-python/app

COPY ./app .


#CMD ["python", "spaceship/app.py"]