#lab3 Logistic regression 2
Logit2 <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Lab-3-Cases/Logit2.xlsx")
str(Logit2)
Logit2 <- Logit2[,-c(1)]
Logit2$Patient <- as.factor(Logit2$Patient)

#Model
Model <- glm(Patient~.,data = Logit2, family = "binomial")
summary(Model)

#Predictions
Result <- predict(Model,Logit2[,c(1,2,3,4)],type = "response") 
#Confusion matrix & Accuracy
table(Actual= Logit2$Patient, Predicted = Result>0.5)
(8+14)*100/30

#Omnibus test
library(rcompanion)
nagelkerke(Model) #Should less than 0.05
#Homer-lemeshow test
library(glmtoolbox)
hltest(Model) #Should greater than 0.05

#ROC Curve
library(ROCR)
rocPred = prediction(Result,Logit2$Patient)
rocPref = performance(rocPred,"tpr","fpr")
plot(rocPref,colorize = TRUE)
