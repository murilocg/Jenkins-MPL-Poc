
def call(body){
    
    library('mpl')
    MPLModulesPath('lib')

    node('ec2'){
        stage('Build'){
            MPLModule('Build', [
                nomeApp: body.nomeApp
            ])
        }
    }

}