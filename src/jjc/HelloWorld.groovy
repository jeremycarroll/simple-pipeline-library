package jjc

class HelloWorld implements Serializable {
   def steps
   HelloWorld(steps) {
      this.steps = steps
   }
   void run(String nodeRestrictions) {
      steps.node(nodeRestrictions) {
          steps.stage('Checkout') {
            steps.checkout(steps.scm)
          }
          steps.stage('Hello Moon') {
            steps.echo('Hello World')
          }
      }
   }
}


