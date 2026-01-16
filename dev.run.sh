#!/bin/bash

# 스크립트가 종료될 때 백그라운드 프로세스도 같이 종료되게 설정
trap 'kill $(jobs -p)' EXIT

./gradlew build --continuous &
./gradlew bootRun