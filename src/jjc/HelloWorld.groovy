package jjc

class HelloWorld implements Serializable {
   def steps
   HelloWorld(steps) {
      this.steps = steps
   }
   void run() {
      steps.stage('Hello Moon') {
        steps.echo('Hello World')
      }
   }
}


