#Feature Selection using R
baru <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-16-Feature Selection Using R/baru.xlsx")
attach(baru)
str(baru)
baru$class = as.factor(baru$class)

library(Boruta)
library(mlbench)
library(randomForest)
set.seed(117)

boruta <- Boruta(class~.,data = baru,doTrace = 2)
boruta <- Boruta(class~.,data = baru,doTrace = 2, maxRuns=500)
print(boruta)
plot(boruta)

#Tentative Fix
bor<- TentativeRoughFix(boruta)
bor
attStats(bor)

set.seed(117)
#Data Partition
ind <- sample(2,nrow(baru),replace = TRUE,prob = c(0.8,0.2))
train <- baru[ind==1,]
test <- baru[ind==2,]

set.seed(117)
rf_all = randomForest(class~.,data = train)
p1 <- predict(rf_all,test)
library(caret)
confusionMatrix(p1,test$class)

getNonRejectedFormula(boruta)
getNonRejectedFormula(bor)

set.seed(117)
rf_nonRejct = randomForest(class ~ V2 + V3 + V5 + V8 + V11 + V12 + V13 + V14 + V15 + V20 + 
                             V24 + V25 + V26 + V27 + V33 + V35 + V37 + V38 + V40 + V41 + 
                             V42 + V43 + V45 + V47 + V49 + V50 + V52 + V53 + V55 + V57 + 
                             V58 + V59 + V60 + V62 + V66 + V68 + V70 + V72 + V73 + V79 + 
                             V81 + V82 + V83 + V84 + V86 + V87 + V88,data = train)
p2 <- predict(rf_nonRejct,test)
library(caret)
confusionMatrix(p2,test$class)

getConfirmedFormula(boruta)

set.seed(117)
rf_conf = randomForest(class ~ V2 + V3 + V5 + V8 + V11 + V12 + V13 + V14 + V15 + V20 + 
                         V24 + V25 + V26 + V27 + V35 + V37 + V38 + V40 + V41 + V42 + 
                         V43 + V45 + V47 + V49 + V50 + V52 + V53 + V55 + V57 + V58 + 
                         V59 + V60 + V66 + V68 + V70 + V72 + V73 + V79 + V81 + V82 + 
                         V83 + V84 + V86 + V87 + V88,data = train)
p3 <- predict(rf_conf,test)
library(caret)
confusionMatrix(p3,test$class)
