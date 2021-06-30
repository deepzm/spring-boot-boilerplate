#!/bin/bash

set -ex

cd contracts/

npm install

docker-compose down --rmi local
docker-compose up -d

sleep 20