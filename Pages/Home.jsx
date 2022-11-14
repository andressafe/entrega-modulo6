import { View, Image, Text, StyleSheet, ScrollView } from "react-native";
import Rodape from "../Components/Rodape";
import Section from "../Components/Section";
import Titulo from "../Components/Titulo";


export default function Home() {
    return (
        <ScrollView>
            <Titulo />
            <View style={styles.container}>
                <Image source={require('../Image/imagens/saopaulo.png')}
                    style={{ width: 450, height: 290 }} />
                <Text style={styles.slogan}>Passagens aéreas para São Paulo a partir de R$ 206 saindo de várias cidades!</Text>
            </View>
            <Section texto="Vem ver opções." />
            <View style={styles.container}>
                <Image source={require('../Image/imagens/riodejaneiro.png')}
                    style={{ width: 450, height: 290 }} />
                <Text style={styles.slogan}>Voos flexíveis para o Rio de Janeiro a partir de R$ 191 ida e volta!</Text>
            </View>
            <Section texto="Vem ver opções." />
            <View style={styles.container}>
                <Image source={require('../Image/imagens/belohorizonte.png')}
                    style={{ width: 450, height: 290}} />
                <Text style={styles.slogan}>Belo Horizonte a partir de R$ 218 saindo de São Paulo e mais cidades!</Text>
            </View>
            <Section texto="Vem ver opções."/>
            <View style={styles.container}>
                <Image source={require('../Image/imagens/salvador.png')}
                    style={{ width: 450, height: 290 }} />
                <Text style={styles.slogan}>Pacotes para Salvador! Voos mais hospedagem de 4 a 7 noites a partir de R$ 863 por pessoa!</Text>
            </View>
            <View style={styles.container}>
                <Image source={require('../Image/imagens/recife.png')}
                    style={{ width: 450, height: 290 }} />
                <Text style={styles.slogan}>Flexíveis para Recife ou Maceió a partir de R$ 446 saindo de São Paulo e mais cidades!</Text>
            </View>
            <Rodape/>
        </ScrollView>
    );
}

const styles = StyleSheet.create({
    slogan: {
        textAlign: 'center',
        position: 'absolute',
        color: ' #ffd700',
        textShadowRadius: 30,
        textShadowColor: '#080707',
        fontSize: 40
    },
    container: {
        justifyContent: 'center',
       alignItems: 'center'
    },
});
