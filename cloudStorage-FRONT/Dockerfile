FROM node:14.18.1

# Create app directory
WORKDIR /usr/src/app

# Install app dependencies
# A wildcard is used to ensure both package.json AND package-lock.json are copied
# where available (npm@5+)
COPY package*.json ./

RUN npm install
# If you are building your code for production
# RUN npm ci --only=production

# Bundle app source


COPY . .

#RUN npm run serve
#RUN npm run build
#RUN npm run lint
#RUN npm run tsc

WORKDIR /usr/src/app/src

EXPOSE 8080:8080
CMD [ "npm", "run", "serve" ]
#CMD [ "sleep" ,"5000" ]