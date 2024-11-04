#logisteic regression
logit <- read_excel("C:/Users/dbda/Desktop/Advance Analytics-2024/Day-10_Logistic Regression & Discriminant Analsysis/Logistic Regression/logit.xlsx")
attach(logit)

str(logit)
logit$type <- as.factor(logit$type)

#Model
Model <- glm(type~. , data = logit, family = "binomial")
summary(Model)

#Prediction
Result <- predict(Model,logit, type = "response")
Result

table(Actual = logit$type, Predicted = Result>0.5)

table(Actual = logit$type, Predicted = Result>0.3)

#ROC curve
library(ROCR)
RocPred <- prediction(Result,logit$type)
RocPref <- performance(RocPred,"tpr","fpr")
plot(RocPref,colorize=TRUE,print.cutoff.at = seq(0.1,by = 0.1))

#RCompanion
library(rcompanion)
nagelkerke(Model)

library(glmtoolbox)
hltest(Model)
