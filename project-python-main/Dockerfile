FROM python:3.9

WORKDIR /home/project-python
#COPY requirements/backend.in /requirements/.

COPY . .

RUN pip install --no-cache-dir -r ./requirements/backend.in

#CMD ["python", "spaceship/app.py"]