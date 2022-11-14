import { View, StyleSheet, Text, Image, ScrollView  } from "react-native";
import Subtitulo from "../Components/Subtitulo";
import Titulo from "../Components/Titulo";
import Card from "../Components/Card";
import Rodape from "../Components/Rodape";


export default function Promocao() {
    return (
        <ScrollView>
            <Titulo />
            <Subtitulo nome="Promoção" />
            <Text style={styles.categoria}>Passagens Aéreas com preços acessíveis</Text>

            <View style={styles.container}>
                <Image source={require('../Image/imagens/saopaulo.png')}
                    style={{ width: 250, height: 150 }} />
                <Card pacote="Pacote de Viagem - São Paulo" preco="De R$ 350,00
Por R$ 206,00+ taxas | Em até 12x Cancelamento Grátis!
895,00" />
            </View>

            <View style={styles.container}>
                <Image source={require('../Image/imagens/riodejaneiro.png')}
                    style={{ width: 250, height: 150 }} />
                <Card pacote="Pacote de Viagem - Rio de Janeiro " preco="De R$ 206,00
Por R$ 191,00+ taxas | Em até 12x Cancelamento Grátis!" />
            </View>

            <View style={styles.container}>
                <Image source={require('../Image/imagens/recife.png')}
                    style={{ width: 250, height: 150 }} />
                <Card pacote="Pacote de Viagem - Recife" preco="De R$ 502,00
Por R$ 446,00+ taxas | Em até 12x Cancelamento Grátis!930,00" />
            </View>

            <View style={styles.container}>
                <Image source={require('../Image/imagens/salvador.png')}
                    style={{ width: 250, height: 150 }} />
                <Card pacote="Pacote de Viagem - Salvador" preco="De R$ 1200,00
Por R$ 863,00+ taxas Em até 12x Cancelamento Grátis!50,00" />
            </View>

            <View style={styles.container}>
                <Image source={require('../Image/imagens/belohorizonte.png')}
                    style={{ width: 250, height: 150 }} />
                <Card pacote="Pacote de Viagem - Belo Horizonte" preco="De R$ 350,00
Por R$218,00Cancelamento Grátis!" />
        

            </View>
            <Rodape/>
        </ScrollView>
    );
}

const styles = StyleSheet.create({
    categoria: {
        color: '#ffd700',
        justifyContent: 'center',
        marginLeft: 20,
        margin: 25,
        fontSize: 20
    },
    container: {
        alignSelf: 'center',
        marginVertical: 15,
    }
});