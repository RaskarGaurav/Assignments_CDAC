#Lab3 Logistic Regression
Logit1 <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Lab-3-Cases/Logit1.xlsx")

str(Logit1)
Logit1$Risk <- as.factor(Logit1$Risk)
str(Logit1)

#Model
Model <- glm(Risk~.,data = Logit1, family = "binomial" )
summary(Model)

#Prediction
Result <- predict(Model,Logit1[,c(1,2)],type = "response")
#Confusion Matrix & Accuracy
table(Actual= Logit1$Risk, Predicted=Result>0.5)
38*100/40

#Omnibus Teest
library(rcompanion)
nagelkerke(Model)
#Hosmer-Lemeshow Test
library(glmtoolbox)
hltest(Model)

#ROC curve
library(ROCR)
rocpred <- prediction(Result,Logit1$Risk)
rocpref <- performance(rocpred,"tpr","fpr")
plot(rocpref,colorize = TRUE)
