![Git](https://git-scm.com/images/logo@2x.png)

# ขั้นตอนการเพิ่มไฟล์ด้วย Git ผ่าน Git Bash

## สำหรับการส่งงานที่ห้อง LAB ในครั้งต่อๆ ไป

1. ดาวน์โหลด git bash จากอินเทอร์เน็ต
[ดาวน์โหลด](https://git-scm.com/downloads "Download git")

2. ทำการติดตั้งให้เรียบร้อย
3. ทำการ config ชื่อผู้ใช้ และ อีเมล์
```shell
$ git config --global user.name = "<ชื่อผู้ใช้ที่เชื่อมกับ github>"
$ git config --global user.email = "<อีเมล์ที่เชื่อมกับ github>"
```
4. clone git เดิม
```shell
$ git clone https://github.com/*username*/*student_id*.git
```
5. เพิ่มไฟล์โดยการใช้คำสั่ง
```shell
$ git add *
```
- เราอาจใช้ * เพื่อเพิ่มไฟล์ทั้งหมด หรือเป็น path ของไฟล์ก็ได้
6. ทำการ commit โดยใช้คำสั่งต่อไปนี้
```shell
$ git commit -m "ข้อความอะไรก็ได้"
```
7. ทำการ push ไฟล์
```shell
$ git push -u origin master
```
## สำหรับการส่งงานที่ห้อง LAB เป็นครั้งแรก

1. ดาวน์โหลด git bash จากอินเทอร์เน็ต
[ดาวน์โหลด](https://git-scm.com/downloads "Download git")

2. ทำการติดตั้งให้เรียบร้อย
3. ทำการ config ชื่อผู้ใช้ และ อีเมล์ ที่เชื่อมโยงกับ git ดังนี้
```shell
$ git config --global user.name = "<ชื่อผู้ใช้ที่เชื่อมกับ github>"
$ git config --global user.email = "<อีเมล์ที่เชื่อมกับ github>"
```
4. ไปยังโฟลเดอร์ที่ต้องการ คลิกขวา เลือก **Git Bash Here**
5. เริ่มการทำงานของ git โดยสั่ง
```shell
$ git init
```
6. เพิ่มไฟล์โดยการใช้คำสั่ง
```shell
$ git add *
```
- เราอาจใช้ * เพื่อเพิ่มไฟล์ทั้งหมด หรือเป็น path ของไฟล์ก็ได้
7. ทำการ commit โดยใช้คำสั่งต่อไปนี้
```shell
$ git commit -m "ข้อความอะไรก็ได้"
```
8. ทำการ add origin โดยใช้คำสั่ง
```shell
$ git remote add origin https://github.com/*username*/*student_id*.git
```
9. ทำการ push ไฟล์
```shell
$ git push -u origin master
```

## ภาคผนวก
ก. เราใช้คำสั่ง ```git status``` ในการดูสถานะของไฟล์
```shell
$ git status
```
ข. เราใช้คำสั่ง ```git config --list``` ในการตรวจสอบการตั้งค่าทั้งหมด
```shell
$ git config --list
```
ค. เราใช้คำสั่ง ```git remote -v``` ในการตรวจสอบ remote ทั้งหมด
```shell
$ git remote -v
```

## เอกสารอ้างอิง
Scott Chacon, and Ben Straub. (2014). **[Pro Git](https://git-scm.com/book/en/v2 "Git E-book")**. Apress.
